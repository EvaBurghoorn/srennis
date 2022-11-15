-- CREATE DATABASE IF NOT EXISTS srennis;
-- USE srennis;
CREATE TABLE IF NOT EXISTS user (
  nameId int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) DEFAULT NULL,
  email varchar(80) DEFAULT NULL,
  password varchar(80) DEFAULT NULL,
  PRIMARY KEY (nameId)
)
CREATE TABLE IF NOT EXISTS profile (
  profileId int(11) NOT NULL AUTO_INCREMENT,
  nameId int(11) NOT NULL,
  amountId int(11) NOT NULL,
  PRIMARY KEY (profileId)
)
CREATE TABLE IF NOT EXISTS badge (
  badgeId int(11) NOT NULL AUTO_INCREMENT,
  badgeName varchar(30) DEFAULT NULL,
  badgeDescription varchar(200) DEFAULT NULL,
  image varchar(100) DEFAULT NULL,
  PRIMARY KEY (badgeId)
)
CREATE TABLE IF NOT EXISTS footprint (
  footprintId int(11) NOT NULL AUTO_INCREMENT,
  nameid int(11) NOT NULL,
  footprintSize int(11) DEFAULT NULL,
  PRIMARY KEY (footprintId)
)
CREATE TABLE IF NOT EXISTS treeamount (
  amountId int(11) NOT NULL AUTO_INCREMENT,
  treeId int(11) NOT NULL,
  profileId int(11) NOT NULL,
  amountOfTrees int(10) DEFAULT NULL,
  PRIMARY KEY (amountId)
)
CREATE TABLE IF NOT EXISTS tree (
  treeid int(11) NOT NULL AUTO_INCREMENT,
  treeName varchar(50) DEFAULT NULL,
  treeType varchar(50) DEFAULT NULL,
  PRIMARY KEY (treeid)
)