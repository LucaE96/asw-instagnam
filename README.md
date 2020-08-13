# asw-instagnam
ASW course's 2019-2020 project (http://cabibbo.dia.uniroma3.it/asw/progetti/asw-progetto-2019-2020.pdf)

-------------------------------------------------------------------------------------------------------------

# Versione Contenitori in Rete

1) gradle build del progetto
2) build-all.sh 
	-> crea immagini e volumi dei contenitori in gioco
3) create-network.sh
	-> crea una rete bridge per far comunicare tra loro i contenitori
4) run-all.sh
	-> lancia i contenitori nella rete creata
5) init-dbs.sh
	-> inizializza i database dei contenitori (da lanciare dopo qualche secondo dall'avvio dei contenitori)
	[5.1) test-new-ricetta-and-connessioni.sh																]
	[	-> aggiunge una nuova ricetta di un nuovo autore, e vengono aggiunte due connessioni al nuovo autore]
6) stop-all.sh
	-> stop+rm dei contenitori in esecuzione
	
Le altre versioni del progetto (Docker Compose, Kubernetes) sono presenti negli altri branch.