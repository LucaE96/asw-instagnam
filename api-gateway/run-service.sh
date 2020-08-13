#!/bin/bash

echo [Api-Gateway]: Starting Service in a Docker Container 
docker run -d -p 8080:8080 --name api-gateway api-gateway