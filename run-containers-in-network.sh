#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory


docker run -d --network=asw-net --name consul -p 8500:8500 consul
docker run -d --network=asw-net --name api-gateway -p 8080:8080 api-gateway
docker-compose -f "$DIR"/kafka/docker-compose.yml up -d
docker run -d --network=asw-net --name ricetteseguite-db -v ricetteseguite-volume:/var/lib/postgresql/data ricetteseguite-db
docker run -d --network=asw-net --name ricetteseguite ricetteseguite
docker run -d --network=asw-net --name connessioni-db -v connessioni-volume:/var/lib/postgresql/data connessioni-db
docker run -d --network=asw-net --name connessioni connessioni
docker run -d --network=asw-net --name ricette-db -v ricette-volume:/var/lib/postgresql/data ricette-db
docker run -d --network=asw-net --name ricette ricette

