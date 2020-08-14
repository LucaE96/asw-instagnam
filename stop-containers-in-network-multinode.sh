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
docker stop connessioni_1
docker rm connessioni_1
docker stop connessioni_2
docker rm connessioni_2


echo ""
echo Halting connessioni-db...
docker stop connessioni-db
docker rm connessioni-db


echo ""
echo Halting ricette...
docker stop ricette_1
docker rm ricette_1
docker stop ricette_2
docker rm ricette_2
docker stop ricette_3
docker rm ricette_3

echo ""
echo Halting ricette-db... 
docker stop ricette-db
docker rm ricette-db


echo ""
echo Halting ricetteseguite...
docker stop ricetteseguite_1
docker rm ricetteseguite_1
docker stop ricetteseguite_2
docker rm ricetteseguite_2
docker stop ricetteseguite_3
docker rm ricetteseguite_3
docker stop ricetteseguite_4
docker rm ricetteseguite_4

echo ""
echo Halting ricetteseguite-db...
docker stop ricetteseguite-db
docker rm ricetteseguite-db