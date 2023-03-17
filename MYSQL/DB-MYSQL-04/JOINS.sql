USE generation;

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- INNER JOIN 
-- t.students t countries
-- Encontrar a que pais pertenece
SELECT students.*, countries.name, countries.code
FROM students
INNER JOIN countries
ON
students.nationality = countries.idCountries;

SELECT 
	students.idStudent AS 'ID',
    students.name 'Nombre',
    students.last_name 'Apellido',
	countries.name AS 'País de origen', 
	countries.code AS 'Codigo de país'
	FROM students
	INNER JOIN countries
	ON students.nationality = countries.idCountries;
    

-- Encontramos que tipo de ID tiene la raza
SELECT
	students.idStudent AS 'ID',
    students.name AS 'Nombre',
    students. last_name 'Apellido',
    idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes;

-- Abreviaciones
SELECT
	t1.name,
    t2.name,
    t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;

-- Estudiantes que esten registrados en un curso
-- Nombre, ID, Apellido, Curso al que pertenecese

SELECT
students.idstudent as 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
courses_has_students.course_code AS 'Nombre del Curso'
FROM students
INNER JOIN courses_has_students
ON courses_has_students.students_id_student = students.idstudent;

-- Buscar estudiantes y el curso al que pertenecen
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- GROUP BY sirve para agrupar datos agregados/coincidentes
SELECT
t1.course_code 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;


-- Encontrar estudiantes que sean del pais 125
SELECT 
students.name AS 'Nombre', 
students.last_name AS 'Apellido',
countries.idCountries AS 'ID País', 
countries.Name AS 'Nombre del País'
FROM students
INNER JOIN countries ON students.nationality = countries.idCountries
WHERE countries.idCountries = '125';

-- Contar estudiantes que pertenezcan al curso JAVA-1
SELECT
  Courses_has_Students.course_code,
  Courses_has_Students.students_id_student,
  Students.idStudent,
  Students.name,
  Students.last_name
FROM Students
INNER JOIN Courses_has_Students
ON  Students.idStudent = Courses_has_Students.students_id_student
WHERE Courses_has_Students.course_code = "JAVA-1";
  
SELECT COUNT(*) AS 'Estudiantes JAVA 1'
FROM students
INNER JOIN courses_has_students
ON  students.idStudent = courses_has_students.students_id_student
WHERE courses_has_students.course_code = "JAVA-1";

-- Contar estudiantes por cada modulo
SELECT modules.name AS 'Nombre Modulo', COUNT(*) AS 'Total Estudiantes'
FROM modules
INNER JOIN courses ON modules.code = courses.module_code
INNER JOIN courses_has_students ON courses.code = courses_has_students.course_code
GROUP BY modules.name;

-- Encontrar estudiantes sin curso


-- DROP DATABASE GENERATION;
-- DROP DATABASE BUSSINES;
-- DROP DATABASE MYDB;