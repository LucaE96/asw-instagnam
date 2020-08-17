#!/bin/bash

curl -i -X POST -H 'Content-Type: application/json' -d '{"autore":"Luca","titolo":"Pizza Buona","preparazione":"Zucchine e Speck"}' http://instagnam/ricette/ricette \
& \
curl -i -X POST -H 'Content-Type: application/json' -d '{"follower":"Anna","followed":"Luca"}' http://instagnam/connessioni/connessioni \
& \
curl -i -X POST -H 'Content-Type: application/json' -d '{"follower":"Gennaro","followed":"Luca"}' http://instagnam/connessioni/connessioni
