/*
 CREATE TABLE `danielvrp`.`medico` (
  `idmedico` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `especialidade` INT NOT NULL,
  `crm` INT NOT NULL,
  `CPF` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idmedico`));

CREATE TABLE `danielvrp`.`paciente` (
  `idpaciente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  PRIMARY KEY (`idpaciente`));

CREATE TABLE `danielvrp`.`consulta` (
  `idconsulta` INT NOT NULL AUTO_INCREMENT,
  `convenio` VARCHAR(100) NOT NULL,
  `id_medico` INT NOT NULL,
  `id_paciente` INT NOT NULL,
  PRIMARY KEY (`idconsulta`),
  CONSTRAINT `id_medico`
    FOREIGN KEY (`id_medico`)
    REFERENCES `danielvrp`.`medico` (`idmedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_paciente`
    FOREIGN KEY (`id_paciente`)
    REFERENCES `danielvrp`.`paciente` (`idpaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
 */

