CREATE TABLE IF NOT EXISTS public.connessione (
    id SERIAL PRIMARY KEY,
    follower VARCHAR(255),
    followed VARCHAR(255)
);