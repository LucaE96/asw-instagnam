CREATE TABLE IF NOT EXISTS public.ricetta_completa (
    id SERIAL PRIMARY KEY,
    autore VARCHAR(255),
    titolo VARCHAR(255),
    preparazione TEXT
);