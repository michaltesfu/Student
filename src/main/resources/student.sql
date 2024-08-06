-- Inserting data into the classrooms table
INSERT INTO classrooms (building_name, room_number) VALUES ('MCLaughlin building', 'M105');

-- Inserting data into the transcripts table
INSERT INTO transcripts (degree_title) VALUES
                                           ('BS Computer Science'),
                                           ('LAW'),
                                           ('Pharmacy'),
                                           ('Medical Doctor');

-- Inserting data into the students table
INSERT INTO students (student_number, first_name, middle_name, last_name, cgpa, date_of_enrollment, transcript_id, class_room_id) VALUES
                                                                                                                                      ('000-61-0001', 'Anna', 'Lynn', 'Smith', 3.45, '2023-08-21', 1, 1),
                                                                                                                                      ('000-61-0002', 'Michal', 'G', 'Tesfu', 3.78, '2021-08-21', 2, 1),
                                                                                                                                      ('000-61-0003', 'Helen', 'M', 'David', 3.45, '2020-04-11', 3, 1),
                                                                                                                                      ('000-61-0004', 'Jossi', 'L', 'John', 3.45, '2022-03-30', 4, 1);
INSERT INTO courses (course_code, course_name) VALUES
                                                   ('CS101', 'Introduction to Computer Science'),
                                                   ('LAW201', 'Constitutional Law'),
                                                   ('PHAR301', 'Pharmaceutical Chemistry'),
                                                   ('MD401', 'Advanced Medical Studies');

-- Establishing many-to-many relationships between students and courses
INSERT INTO students_courses (student_id, course_id) VALUES
                                                        (1, 1),
                                                        (1, 2),
                                                        (2, 1),
                                                        (2, 3),
                                                        (3, 3),
                                                        (3, 4),
                                                        (4, 4),
                                                        (4, 1);