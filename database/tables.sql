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
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

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


