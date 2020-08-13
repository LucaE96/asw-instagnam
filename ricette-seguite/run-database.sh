#!/bin/bash

echo [RicetteSeguite]: Starting Postgres in a Docker Container 
docker run -d --name ricetteseguite-db -p 5434:5432 -v ricetteseguite-volume:/var/lib/postgresql/data ricetteseguite-db