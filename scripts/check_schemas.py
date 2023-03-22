import json
import jsonschema
import jsonschema.validators
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

            if '$schema' not in data:
                data['$schema'] = jsonschema.Draft7Validator.META_SCHEMA.get("$schema")
                print("[Warning] Schema " +
                      file + f" does not contain a $schema property. Assuming Draft-07 ({data['$schema']}).")

            # if the $schema property is a link, we need to (down-)load it
            schema = data['$schema']
            if schema.startswith("http"):
                print("Found Link to schema.")
                if schema in schema_cache:
                    print("Found schema existing in cache.")
                    schema = schema_cache[data['$schema']]
                else:
                    print("Did not find schema in cache, downloading from " + schema + "...")
                    schema_cache[schema] = schema = json.loads(requests.get(schema).text)

            try:
                jsonschema.validate(data, schema)
            except jsonschema.exceptions.ValidationError as e:
                print("[Error] Schema " + file + "does not adhere to schema " + data['$schema'] + ": " + str(e))
                has_errors = True

            if not data.get('title'):
                print("[Error] Schema " + file + " does not contain a title.")
                has_errors = True

    sys.exit(1 if has_errors else 0)
