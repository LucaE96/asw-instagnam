#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

while read connessione; do
	curl -i -X POST -H 'Content-Type: application/json' -d "$connessione" http://localhost:8080/connessioni/connessioni
done < "$DIR"/starting-db-data.txt