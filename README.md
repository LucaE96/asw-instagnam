# ASW - Instagnam
Progetto del corso di Architetture e Sistemi Software, A.A. 2019-2020

[http://cabibbo.dia.uniroma3.it/asw/progetti/asw-progetto-2019-2020.pdf]


Autore: Luca Emili


3 modalità diverse di orchestrazione dei contenitori del progetto: Contenitori in Rete, Docker Compose, Kubernetes.


NB: per garantire l'idempotenza delle operazioni sono stati aggiunti dei vincoli di integrità (del tipo UNIQUE(x,y)) nelle relazioni

NB: per accedere ai servizi di queste modalità gli url sono del tipo:

http://localhost:8080/ricette/ricette

http://localhost:8080/connessioni/connessioni

http://localhost:8080/ricette-seguite/ricetteseguite


La modalità Kubernetes è presente nel branch kubernetes [https://github.com/LucaE96/asw-instagnam/tree/kubernetes]


-------------------------------------------------------------------------------------------------------------------------------------------------

# Contenitori in Rete

1 - gradle build del progetto

2 - create-volumes.sh  [crea i volumi dei database dei servizi]

3 - build-containers.sh  [crea le immagini dei contenitori in gioco]

4 - create-network.sh  [crea una rete bridge per far comunicare tra loro i contenitori]

5a - run-containers-in-network.sh  [lancia i contenitori nella rete creata]

5b - run-containers-in-network-multinode.sh  [lancia più istanze dei servizi]

6 - init-dbs.sh  [inizializza i database dei contenitori (da lanciare dopo qualche secondo dall'avvio dei contenitori)]

   6.1 - test-new-ricetta-and-connessioni.sh [aggiunge una nuova ricetta di un nuovo autore, e vengono aggiunte due connessioni al nuovo autore]

7a - stop-containers-in-network.sh  [stop+rm dei contenitori in esecuzione]

7b - stop-containers-in-network-multinode.sh


-------------------------------------------------------------------------------------------------------------------------------------------------

# Docker Compose

1 - gradle build del progetto

2 - create-volumes.sh

3 - build-containers.sh

4a - run-docker-compose.sh

4b - run-docker-compose-multinode.sh

5 - init-dbs.sh

   5.1 - test-new-ricetta-and-connessioni.sh

6 - stop-docker-compose.sh  [va bene sia per la versione "standard" che "multinode"]
