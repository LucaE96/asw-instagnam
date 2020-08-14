#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

bash "$DIR"/api-gateway/build-service-image.sh && 
bash "$DIR"/connessioni/build-database-image.sh && 
bash "$DIR"/connessioni/build-service-image.sh &&
bash "$DIR"/ricette/build-database-image.sh && 
bash "$DIR"/ricette/build-service-image.sh
bash "$DIR"/ricette-seguite/build-database-image.sh && 
bash "$DIR"/ricette-seguite/build-service-image.sh