CREATE TABLE IF NOT EXISTS public.connessione (
    id SERIAL PRIMARY KEY,
    follower VARCHAR(255) NOT NULL,
    followed VARCHAR(255) NOT NULL,
    UNIQUE (follower, followed)
);