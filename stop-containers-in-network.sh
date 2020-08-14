#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

echo ""
echo Halting Consul...
docker stop consul 
docker rm consul 

echo ""
echo Halting api-gateway...
docker stop api-gateway 
docker rm api-gateway 

echo ""
echo Halting Kafka and Zookeeper...
docker-compose -f "$DIR"/kafka/docker-compose.yml down

echo ""
echo Halting connessioni...
docker stop connessioni
docker rm connessioni

echo ""
echo Halting connessioni-db...
docker stop connessioni-db
docker rm connessioni-db


echo ""
echo Halting ricette...
docker stop ricette
docker rm ricette

echo ""
echo Halting ricette-db... 
docker stop ricette-db
docker rm ricette-db


echo ""
echo Halting ricetteseguite...
docker stop ricetteseguite
docker rm ricetteseguite

echo ""
echo Halting ricetteseguite-db...
docker stop ricetteseguite-db
docker rm ricetteseguite-db