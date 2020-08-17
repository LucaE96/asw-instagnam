# ASW - Instagnam
Progetto del corso di Architetture e Sistemi Software, A.A. 2019-2020

[http://cabibbo.dia.uniroma3.it/asw/progetti/asw-progetto-2019-2020.pdf]


Autore: Luca Emili


3 modalità diverse di orchestrazione dei contenitori del progetto: Contenitori in Rete, Docker Compose, Kubernetes.


NB: per garantire l'idempotenza delle operazioni sono stati aggiunti dei vincoli di integrità (del tipo UNIQUE(x,y)) nelle relazioni

NB: per accedere ai servizi di questa modalità gli url sono del tipo: 

http://instagnam/ricette/ricette

http://instagnam/connessioni/connessioni

http://instagnam/ricette-seguite/ricetteseguite

Le modalità Contenitori in Rete e Docker Compose sono presenti nel branch master [https://github.com/LucaE96/asw-instagnam/tree/master]


-------------------------------------------------------------------------------------------------------------------------------------------------

# Kubernetes

1 - settare l'ambiente per eseguire il cluster kubernetes

   1.1 - a seconda dell'ambiente potrebbe essere necessario far partire in kubernetes un controller nginx, per poter esporre gli ingress dell'applicazione

2 - run-kubernetes.sh  [le immagini utilizzate sono pubbliche e già presenti in Docker Hub]

3 - init-dbs.sh

   3.1 - test-new-ricetta-and-connessioni.sh

4 - stop-kubernetes.sh
