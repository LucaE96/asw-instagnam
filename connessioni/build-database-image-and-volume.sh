#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

docker build -t connessioni-db "$DIR"/database
docker volume create --name connessioni-volume