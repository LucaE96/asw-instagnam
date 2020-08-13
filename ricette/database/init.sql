CREATE TABLE IF NOT EXISTS public.ricetta_completa (
    id SERIAL PRIMARY KEY,
    autore VARCHAR(255) NOT NULL,
    titolo VARCHAR(255) NOT NULL,
    preparazione TEXT,
    UNIQUE (autore, titolo)
);