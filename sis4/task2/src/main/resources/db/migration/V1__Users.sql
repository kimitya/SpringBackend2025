CREATE TABLE IF NOT EXISTS users
(
    id    SERIAL,
    email VARCHAR(200) NOT NULL,
    name  VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
    );