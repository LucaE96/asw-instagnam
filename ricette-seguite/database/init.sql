CREATE TABLE IF NOT EXISTS public.ricetta (
    id SERIAL PRIMARY KEY,
    autore VARCHAR(255),
    titolo VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public.connessione (
    id SERIAL PRIMARY KEY,
    follower VARCHAR(255),
    followed VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public.ricetta_seguita (
    utente_follower VARCHAR(255),
    id_ricetta SERIAL REFERENCES public.ricetta(id),
    autore_ricetta VARCHAR(255),
    titolo_ricetta VARCHAR(255),
    PRIMARY KEY (utente_follower,id_ricetta)
);