#!/bin/bash

curl -i -X POST -H 'Content-Type: application/json' -d '{"autore":"Luca","titolo":"Pizza Buona","preparazione":"Zucchine e Speck"}' http://localhost:8080/ricette/ricette \
& \
curl -i -X POST -H 'Content-Type: application/json' -d '{"follower":"Anna","followed":"Luca"}' http://localhost:8080/connessioni/connessioni \
& \
curl -i -X POST -H 'Content-Type: application/json' -d '{"follower":"Gennaro","followed":"Luca"}' http://localhost:8080/connessioni/connessioni
