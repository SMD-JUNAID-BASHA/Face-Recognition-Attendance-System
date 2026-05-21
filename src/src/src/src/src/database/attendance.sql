
CREATE DATABASE attendance_system;


USE attendance_system;


CREATE TABLE students (

    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100)
);


CREATE TABLE attendance (

    attendance_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    student_name VARCHAR(100),
    date DATE,
    time TIME
);
