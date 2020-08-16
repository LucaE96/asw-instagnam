#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

while read ricetta; do
	curl -i -X POST -H 'Content-Type: application/json' -d "$ricetta" http://localhost:8080/ricette/ricette
done < "$DIR"/starting-db-data.txt