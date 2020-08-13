CREATE TABLE IF NOT EXISTS public.ricetta (
    id SERIAL PRIMARY KEY,
    autore VARCHAR(255) NOT NULL,
    titolo VARCHAR(255) NOT NULL,
    UNIQUE (autore, titolo) 
);

CREATE TABLE IF NOT EXISTS public.connessione (
    id SERIAL PRIMARY KEY,
    follower VARCHAR(255) NOT NULL,
    followed VARCHAR(255) NOT NULL,
    UNIQUE (follower, followed)
);

CREATE TABLE IF NOT EXISTS public.ricetta_seguita (
    utente_follower VARCHAR(255) NOT NULL,
    id_ricetta SERIAL REFERENCES public.ricetta(id),
    autore_ricetta VARCHAR(255) NOT NULL,
    titolo_ricetta VARCHAR(255) NOT NULL,
    PRIMARY KEY (utente_follower,id_ricetta)
);