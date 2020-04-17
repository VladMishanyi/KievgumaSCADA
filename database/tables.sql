DROP DATABASE IF EXISTS KievgumaBase;
CREATE DATABASE IF NOT EXISTS KievgumaBase CHARSET = utf8 COLLATE = utf8_general_ci;
USE KievgumaBase;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS Trm201Energetic;
CREATE TABLE Trm201Energetic (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  value1 INT          NOT NULL DEFAULT 0,
  value2 INT          NOT NULL DEFAULT 0,
  value3 FLOAT        NOT NULL DEFAULT 0,
  value4 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS ThirdCehAutoclav;
CREATE TABLE ThirdCehAutoclav (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehAutoclav;
CREATE TABLE FirstCehAutoclav (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehKameraDozrevanya;
CREATE TABLE FirstCehKameraDozrevanya (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  channel4 FLOAT        NOT NULL DEFAULT 0,
  channel5 FLOAT        NOT NULL DEFAULT 0,
  channel6 FLOAT        NOT NULL DEFAULT 0,
  channel7 FLOAT        NOT NULL DEFAULT 0,
  channel8 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

# ALTER TABLE FirstCehKameraDozrevanya
#     ADD channel4 FLOAT NOT NULL DEFAULT 0,
#     ADD channel5 FLOAT NOT NULL DEFAULT 0,
#     ADD channel6 FLOAT NOT NULL DEFAULT 0,
#     ADD channel7 FLOAT NOT NULL DEFAULT 0,
#     ADD channel8 FLOAT NOT NULL DEFAULT 0;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehBuzuluk;
CREATE TABLE FirstCehBuzuluk (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS SevenCehAutoclav;
CREATE TABLE SevenCehAutoclav (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehSmesitel1KMSF1;
CREATE TABLE FirstCehSmesitel1KMSF1 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 INT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehSmesitel2KMSF1;
CREATE TABLE FirstCehSmesitel2KMSF1 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 INT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehSmesitel3KMSF1;
CREATE TABLE FirstCehSmesitel3KMSF1 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 INT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehSmesitel4KMSF1;
CREATE TABLE FirstCehSmesitel4KMSF1 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 INT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS FirstCehSmesitel5KMSF1;
CREATE TABLE FirstCehSmesitel5KMSF1 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 INT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS LaboratoryAutoclavMV110;
CREATE TABLE LaboratoryAutoclavMV110 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS KotelnyaParMikrolITM4;
CREATE TABLE KotelnyaParMikrolITM4 (
  id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date     TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  channel4 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id          INT UNSIGNED                                      NOT NULL         AUTO_INCREMENT,
  date        TIMESTAMP                                         NOT NULL         DEFAULT CURRENT_TIMESTAMP,
  role        ENUM ('SUPERADMIN', 'ADMIN', 'CLIENT', 'ANOTHER') NOT NULL         DEFAULT 'CLIENT',
  name        VARCHAR(50)                                       NOT NULL         DEFAULT '',
  login       VARCHAR(50)                                       NOT NULL         DEFAULT ''         UNIQUE ,
  password    VARCHAR(64)                                       NOT NULL         DEFAULT '',
  description TEXT                                              NOT NULL         ,
  locked      TINYINT(1)                                        NOT NULL         DEFAULT TRUE,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS SecondCehKameraVulcan1;
CREATE TABLE SecondCehKameraVulcan1 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS SecondCehKameraVulcan2;
CREATE TABLE SecondCehKameraVulcan2 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS SecondCehKameraVulcan3;
CREATE TABLE SecondCehKameraVulcan3 (
  id     INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  channel1 FLOAT        NOT NULL DEFAULT 0,
  channel2 FLOAT        NOT NULL DEFAULT 0,
  channel3 FLOAT        NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS logger;
CREATE TABLE logger (
    id          INT UNSIGNED NOT NULL AUTO_INCREMENT,
    date        TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    name        VARCHAR(255) NOT NULL DEFAULT '',
    information TEXT         NOT NULL,
    PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
INSERT INTO users (id, date, role, name, login, password, description, locked) VALUES (1, CURRENT_TIMESTAMP, 'ADMIN', 'ad', 'admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', 'new', FALSE);
