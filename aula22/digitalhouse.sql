CREATE TABLE aluno(
	matricula INT NOT NULL ,
	nome VARCHAR(30) NOT NULL ,
	curso VARCHAR(30) NOT NULL ,
	turma VARCHAR(10) NOT NULL ,
	
	PRIMARY KEY (matricula)) 
	ENGINE = InnoDB CHARSET=utf8mb4 COLLATE utf8mb4_general_ci;
	
INSERT INTO aluno(matricula, nome, curso, turma) VALUES 
(123, "Eder Sant'ana", 'Full Stack', 'T05')	;

UPDATE aluno SET matricula = 1234,`nome`='Eder Santos' WHERE matricula = 123;
--1234 Eder Santos Full Stack T05

SELECT * FROM aluno WHERE matricula = 1234;

SELECT nome FROM aluno WHERE matricula = 1234;

DELETE FROM aluno WHERE matricula = 1234;

drop DATABASE digitalhouse;