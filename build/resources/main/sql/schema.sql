CREATE TABLE IF NOT EXISTS book
(
    id     INT AUTO_INCREMENT NOT NULL,
    name   VARCHAR(255),
    author VARCHAR(255),
    "year" INT                NOT NULL,
    CONSTRAINT pk_book PRIMARY KEY (id)
);