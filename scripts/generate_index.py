import jinja2
import json
import sys
import os
from glob import glob


if __name__ == '__main__':
    if len(sys.argv) > 1:
        files = glob(os.path.join(sys.argv[1], "**", "*.json"), recursive=True)
    else:
        files = glob("*.json")

    schemata = []

    for file in files:
        with open(file, "r") as f:
            data = json.load(f)

            uri = os.path.split(file)[1].replace(".json", ".html")

            if "title" not in data:
                data["title"] = uri

            schemata.append({'title': data["title"], 'uri': uri})

    templateLoader = jinja2.FileSystemLoader(searchpath="site")
    environment = jinja2.Environment(loader=templateLoader, autoescape=True)
    template = environment.get_template("index_template.html")
    output = template.render(schemata=schemata)

    with open("site/index.html", "w") as f:
        f.write(output)
