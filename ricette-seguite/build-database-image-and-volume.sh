#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

docker build -t ricetteseguite-db "$DIR"/database
docker volume create --name ricetteseguite-volume