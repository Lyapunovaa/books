CREATE TABLE IF NOT EXISTS BOOK
(
    id     INT AUTO_INCREMENT NOT NULL,
    name   VARCHAR(255),
    author VARCHAR(255),
    CONSTRAINT pk_book PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS author
(
    id          INT AUTO_INCREMENT NOT NULL,
    first_name  VARCHAR(255),
    last_name   VARCHAR(255),
    middle_name VARCHAR(255),
    is_alive    BOOLEAN NOT NULL,

    CONSTRAINT pk_author PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS cabinet
(
    id          INT AUTO_INCREMENT NOT NULL,
    num_of_rack INT NOT NULL,

    CONSTRAINT pk_cabinet PRIMARY KEY (id)

);