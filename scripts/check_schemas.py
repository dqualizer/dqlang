import json
import jsonschema
import requests
import sys
import os
from glob import glob


# check all .json files in the directory given by the first argument
# they should adhere to the schema given by the schema itself ("$schema" key)
# and they should contain a "title" key

if __name__ == '__main__':
    if len(sys.argv) > 1:
        files = glob(os.path.join(sys.argv[1], "**", "*.json"), recursive=True)
    else:
        files = glob("*.json")

    schema_cache = {}

    has_errors = False

    for file in files:
        with open(file) as f:
            print("Validating " + file + "...")

            if len(sys.argv) > 1:
                file = file.removeprefix(sys.argv[1] + "/")

            data = json.load(f)

            # if the $schema property is a link, we need to download it
            if '$schema' not in data:
                print("[Error] Schema " + file + " does not contain a $schema key.")
                continue
            elif data['$schema'].startswith("http"):
                print("Found Link to schema.")
                if data['$schema'] in schema_cache:
                    print("Found schema existing in cache.")
                    schema_str = schema_cache[data['$schema']]
                else:
                    print("Did not find schema in cache, downloading from " + data['$schema'] + "...")
                    schema_str = json.loads(requests.get(data['$schema']).text)
                    schema_cache[data['$schema']] = schema_str
            else:
                schema_str = data['$schema']

            try:
                jsonschema.validate(data, schema_str)
            except jsonschema.exceptions.ValidationError as e:
                print("[Error] Schema " + file + "does not adhere to schema " + data['$schema'] + ": " + str(e))

            if not data.get('title'):
                print("[Error] Schema " + file + " does not contain a title.")

    sys.exit(1 if has_errors else 0)
