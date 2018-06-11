-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema group_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema group_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `group_db` DEFAULT CHARACTER SET latin1 ;
USE `group_db` ;

-- -----------------------------------------------------
-- Table `group_db`.`usercaseworker`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`usercaseworker` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(25) NULL DEFAULT NULL,
  `password` VARCHAR(25) NULL DEFAULT NULL,
  `firstname` VARCHAR(25) NULL DEFAULT NULL,
  `lastname` VARCHAR(25) NULL DEFAULT NULL,
  `email` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `group_db`.`userclient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`userclient` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NULL DEFAULT NULL,
  `password` VARCHAR(100) NULL DEFAULT NULL,
  `firstname` VARCHAR(100) NULL DEFAULT NULL,
  `lastname` VARCHAR(100) NULL DEFAULT NULL,
  `age` INT(11) NULL DEFAULT NULL,
  `usercaseworker_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `usercaseworker_id`),
  INDEX `fk_userclient_usercaseworker_idx` (`usercaseworker_id` ASC),
  CONSTRAINT `fk_userclient_usercaseworker`
    FOREIGN KEY (`usercaseworker_id`)
    REFERENCES `group_db`.`usercaseworker` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `group_db`.`Industry`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`Industry` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `group_db`.`Job`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`Job` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(45) NOT NULL,
  `Industry_id` INT NOT NULL,
  PRIMARY KEY (`Id`, `Industry_id`),
  INDEX `fk_Job_Industry1_idx` (`Industry_id` ASC),
  CONSTRAINT `fk_Job_Industry1`
    FOREIGN KEY (`Industry_id`)
    REFERENCES `group_db`.`Industry` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `group_db`.`Courses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`Courses` (
  `idCourses` VARCHAR(15) NOT NULL,
  `Title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCourses`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `group_db`.`Units`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`Units` (
  `idUnits` VARCHAR(15) NOT NULL,
  `Title` VARCHAR(45) NOT NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `group_db`.`Courses_has_Courses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `group_db`.`Courses_has_Courses` (
  `Courses_idCourses` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`Courses_idCourses`),
  INDEX `fk_Courses_has_Courses_Courses1_idx` (`Courses_idCourses` ASC),
  CONSTRAINT `fk_Courses_has_Courses_Courses1`
    FOREIGN KEY (`Courses_idCourses`)
    REFERENCES `group_db`.`Courses` (`idCourses`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
