#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

bash "$DIR"/api-gateway/build-service-image.sh && \
docker tag api-gateway lucae96/api-gateway && \
docker push lucae96/api-gateway

bash "$DIR"/connessioni/build-database-image.sh && \
docker tag connessioni-db lucae96/connessioni-db && \
docker push lucae96/connessioni-db

bash "$DIR"/connessioni/build-service-image.sh && \
docker tag connessioni lucae96/connessioni && \
docker push lucae96/connessioni

bash "$DIR"/ricette/build-database-image.sh && \
docker tag ricette-db lucae96/ricette-db && \
docker push lucae96/ricette-db

bash "$DIR"/ricette/build-service-image.sh && \
docker tag ricette lucae96/ricette && \
docker push lucae96/ricette

bash "$DIR"/ricette-seguite/build-database-image.sh && \
docker tag ricetteseguite-db lucae96/ricetteseguite-db && \
docker push lucae96/ricetteseguite-db

bash "$DIR"/ricette-seguite/build-service-image.sh && \
docker tag ricetteseguite lucae96/ricetteseguite && \
docker push lucae96/ricetteseguite
