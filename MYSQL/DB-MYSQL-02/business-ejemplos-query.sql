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