-- USE `business`;

-- Revisar employee
SELECT * FROM `employee`;

-- ALIAS
SELECT last_name AS 'Apellido' FROM employee;

-- ALIAS ++
SELECT
	employee_id AS 'ID',
    first_name AS 'Nombre',
    department AS 'Departamento'
FROM employee;

-- FIltrar por Nombre
-- BUSCAR a Monika
SELECT * FROM employee
WHERE first_name = 'Monika';

-- Filtrar doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble negacion
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian';



-- Ordenamientos
-- ORDER BY
-- (Algunas ocasiones) Default es orden ascendente ASC
SELECT * FROM employee
ORDER BY department ASC;

-- DESC
SELECT * FROM employee
ORDER BY department DESC;

-- Double ORDER BY
SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;

-- IN 
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- BETWEEN 
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- BETWEEN NOT
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT 
SELECT * FROM employee
LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE 
SELECt * FROM employee
WHERE last_name LIKE '%A';

-- Case sensitive
SELECt * FROM employee
WHERE last_name LIKE BINARY '%A';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '2014-02%';

SELECT * FROM employee;
-- Actualizar el salario
UPDATE employee
	SET salary = 300000
WHERE employee_id = 5;

UPDATE employee
	SET salary = 100000
WHERE employee_id = 3;

UPDATE employee
	SET salary = 200000
WHERE employee_id = 7;

UPDATE employee
	SET salary = 300000
WHERe employee_id = 8;

UPDATE employee
	SET salary = 300000
WHERE employee_id = 4;

INSERT INTO employee (first_name, last_name, salary, join_date, department)
VALUES ('Diana', 'Barreto', 1000000, '2022-03-17', 'IT');

INSERT INTO employee (first_name, last_name, salary, join_date, department)
VALUES ('Cristina', 'Trujillo', 1500000, '2022-03-16', 'IT');

INSERT INTO employee (first_name, last_name, salary, join_date, department)
VALUES 
	('Enrique', 'Albarrán', 100000, '2016-09-22', 'IT'),
    ('Yael', 'Gonzalez', 600000, '2016-09-22', 'IT'),
    ('Alex', 'De Leon', 800000, '2021-03-10', 'IT');