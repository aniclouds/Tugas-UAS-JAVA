-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema db_apotek
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_apotek` ;

-- -----------------------------------------------------
-- Schema db_apotek
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_apotek` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `db_apotek` ;

-- -----------------------------------------------------
-- Table `db_apotek`.`petugas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_apotek`.`petugas` ;

CREATE TABLE IF NOT EXISTS `db_apotek`.`petugas` (
  `petugas_kd` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`petugas_kd`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_apotek`.`kategori`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_apotek`.`kategori` ;

CREATE TABLE IF NOT EXISTS `db_apotek`.`kategori` (
  `kategori_kd` VARCHAR(45) NOT NULL,
  `kategori` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`kategori_kd`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_apotek`.`obat`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_apotek`.`obat` ;

CREATE TABLE IF NOT EXISTS `db_apotek`.`obat` (
  `obat_kd` VARCHAR(45) NOT NULL,
  `obat` VARCHAR(45) NOT NULL,
  `jumlah` INT NOT NULL,
  `kategori_kd` VARCHAR(45) NOT NULL,
  `tgl_kadaluarsa` VARCHAR(45) NOT NULL,
  `harga` DOUBLE NOT NULL,
  PRIMARY KEY (`obat_kd`),
  INDEX `fk_kategorikd_obat_idx` (`kategori_kd` ASC),
  CONSTRAINT `fk_kategorikd_obat`
    FOREIGN KEY (`kategori_kd`)
    REFERENCES `db_apotek`.`kategori` (`kategori_kd`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_apotek`.`transaksi`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_apotek`.`transaksi` ;

CREATE TABLE IF NOT EXISTS `db_apotek`.`transaksi` (
  `transaksi_kd` VARCHAR(45) NOT NULL,
  `tanggal_transaksi` DATE NOT NULL,
  PRIMARY KEY (`transaksi_kd`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_apotek`.`transaksi_detil`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_apotek`.`transaksi_detil` ;

CREATE TABLE IF NOT EXISTS `db_apotek`.`transaksi_detil` (
  `transaksi_kd` VARCHAR(45) NOT NULL,
  `obat_kd` VARCHAR(45) NOT NULL,
  `jumlah` INT NOT NULL,
  `harga` DOUBLE NOT NULL,
  PRIMARY KEY (`transaksi_kd`, `obat_kd`),
  INDEX `fk_obat_kd_idx` (`obat_kd` ASC),
  CONSTRAINT `fk_transaksi_kd`
    FOREIGN KEY (`transaksi_kd`)
    REFERENCES `db_apotek`.`transaksi` (`transaksi_kd`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_obat_kd`
    FOREIGN KEY (`obat_kd`)
    REFERENCES `db_apotek`.`obat` (`obat_kd`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
