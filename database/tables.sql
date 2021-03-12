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
DROP TABLE IF EXISTS trm202;
CREATE TABLE trm202 (
                        id                int UNSIGNED NOT NULL AUTO_INCREMENT,
                        date              TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        holdingRegister0  FLOAT        NOT NULL DEFAULT 0,
                        holdingRegister1  FLOAT        NOT NULL DEFAULT 0,
                        PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;
/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS secondCehBalonTRM138;
CREATE TABLE secondCehBalonTRM138 (
                        id              int UNSIGNED NOT NULL AUTO_INCREMENT,
                        date            TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        inputRegister0  FLOAT        NOT NULL DEFAULT 0,
                        inputRegister1  FLOAT        NOT NULL DEFAULT 0,
                        inputRegister2  FLOAT        NOT NULL DEFAULT 0,
                        inputRegister3  FLOAT        NOT NULL DEFAULT 0,
                        inputRegister4  FLOAT        NOT NULL DEFAULT 0,
                        PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS air_sensor1;
CREATE TABLE air_sensor1 (
                                      id              int UNSIGNED NOT NULL AUTO_INCREMENT,
                                      date            TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                      SDS_P1  FLOAT        NOT NULL DEFAULT 0,
                                      SDS_P2  FLOAT        NOT NULL DEFAULT 0,
                                      BME280_temperature  FLOAT        NOT NULL DEFAULT 0,
                                      BME280_humidity  FLOAT        NOT NULL DEFAULT 0,
                                      BME280_pressure  FLOAT        NOT NULL DEFAULT 0,
                                      NH3  FLOAT        NOT NULL DEFAULT 0,
                                      CO  FLOAT        NOT NULL DEFAULT 0,
                                      NO2  FLOAT        NOT NULL DEFAULT 0,
                                      NH3_raw  FLOAT        NOT NULL DEFAULT 0,
                                      CO_raw  FLOAT        NOT NULL DEFAULT 0,
                                      NO2_raw  FLOAT        NOT NULL DEFAULT 0,
                                      PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS silicone_camera_vulcan_trm251;
CREATE TABLE silicone_camera_vulcan_trm251 (
                        id              int UNSIGNED NOT NULL AUTO_INCREMENT,
                        date            TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        inputRegister0  FLOAT        NOT NULL DEFAULT 0,
                        inputRegister1  FLOAT        NOT NULL DEFAULT 0,
                        PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/*----------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS air_sensor2;
CREATE TABLE air_sensor2 (
                             id              int UNSIGNED NOT NULL AUTO_INCREMENT,
                             date            TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
                             SDS_P1  FLOAT        NOT NULL DEFAULT 0,
                             SDS_P2  FLOAT        NOT NULL DEFAULT 0,
                             BME280_temperature  FLOAT        NOT NULL DEFAULT 0,
                             BME280_humidity  FLOAT        NOT NULL DEFAULT 0,
                             BME280_pressure  FLOAT        NOT NULL DEFAULT 0,
                             NH3  FLOAT        NOT NULL DEFAULT 0,
                             CO  FLOAT        NOT NULL DEFAULT 0,
                             NO2  FLOAT        NOT NULL DEFAULT 0,
                             NH3_raw  FLOAT        NOT NULL DEFAULT 0,
                             CO_raw  FLOAT        NOT NULL DEFAULT 0,
                             NO2_raw  FLOAT        NOT NULL DEFAULT 0,
                             PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;
/*----------------------------------------------------------------------------------*/
INSERT INTO users (id, date, role, name, login, password, description, locked) VALUES (1, CURRENT_TIMESTAMP, 'SUPERADMIN', 'su', 'superadmin', '186cf774c97b60a1c106ef718d10970a6a06e06bef89553d9ae65d938a886eae', 'new', FALSE);
INSERT INTO users (id, date, role, name, login, password, description, locked) VALUES (2, CURRENT_TIMESTAMP, 'ADMIN', 'ad', 'admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', 'new', FALSE);
INSERT INTO users (id, date, role, name, login, password, description, locked) VALUES (3, CURRENT_TIMESTAMP, 'CLIENT', 'cl', 'client', '948fe603f61dc036b5c596dc09fe3ce3f3d30dc90f024c85f3c82db2ccab679d', 'new', FALSE);
INSERT INTO users (id, date, role, name, login, password, description, locked) VALUES (4, CURRENT_TIMESTAMP, 'ANOTHER', 'an', 'another', 'ae448ac86c4e8e4dec645729708ef41873ae79c6dff84eff73360989487f08e5', 'new', FALSE);
