#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )" 	# gets this script's directory

bash "$DIR"/connessioni/init-db.sh & bash "$DIR"/ricette/init-db.sh