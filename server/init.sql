
use config_server;

CREATE TABLE `config_server`.`PROPERTIES` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `APPLICATION` VARCHAR(255) NULL,
  `PROFILE` VARCHAR(255) NULL,
  `LABEL` VARCHAR(255) NULL,
  `KEY` VARCHAR(255) NULL,
  `VALUE` VARCHAR(255) NULL,
  PRIMARY KEY (`ID`)
);

insert into PROPERTIES(`APPLICATION`, `PROFILE`, `LABEL`, `KEY`, `VALUE`) values ('client_1', 'dev', 'master', 'hello', 'world');
insert into PROPERTIES(`APPLICATION`, `PROFILE`, `LABEL`, `KEY`, `VALUE`) values ('client_1', 'dev', 'master', 'aaa', '111');
insert into PROPERTIES(`APPLICATION`, `PROFILE`, `LABEL`, `KEY`, `VALUE`) values ('client_1', 'staging', 'master', 'bbb', '222');

insert into PROPERTIES(`APPLICATION`, `PROFILE`, `LABEL`, `KEY`, `VALUE`) values ('client_2', 'dev', 'master', 'ccc', '333');
insert into PROPERTIES(`APPLICATION`, `PROFILE`, `LABEL`, `KEY`, `VALUE`) values ('client_2', 'staging', 'master', 'ddd', '444');
