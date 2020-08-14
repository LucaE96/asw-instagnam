#!/bin/bash

docker-compose up -d --scale connessioni=2 --scale ricette=3 --scale ricetteseguite=4