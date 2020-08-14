#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory


docker run -d --network=asw-net --name consul -p 8500:8500 consul
docker run -d --network=asw-net --name api-gateway -p 8080:8080 api-gateway
docker-compose -f "$DIR"/kafka/docker-compose.yml up -d
docker run -d --network=asw-net --name ricetteseguite-db -v ricetteseguite-volume:/var/lib/postgresql/data ricetteseguite-db
docker run -d --network=asw-net --name ricetteseguite_1 ricetteseguite
docker run -d --network=asw-net --name ricetteseguite_2 ricetteseguite
docker run -d --network=asw-net --name ricetteseguite_3 ricetteseguite
docker run -d --network=asw-net --name ricetteseguite_4 ricetteseguite
docker run -d --network=asw-net --name connessioni-db -v connessioni-volume:/var/lib/postgresql/data connessioni-db
docker run -d --network=asw-net --name connessioni_1 connessioni
docker run -d --network=asw-net --name connessioni_2 connessioni
docker run -d --network=asw-net --name ricette-db -v ricette-volume:/var/lib/postgresql/data ricette-db
docker run -d --network=asw-net --name ricette_1 ricette
docker run -d --network=asw-net --name ricette_2 ricette
docker run -d --network=asw-net --name ricette_3 ricette
