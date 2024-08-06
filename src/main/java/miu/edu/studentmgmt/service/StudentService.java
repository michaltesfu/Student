package miu.edu.studentmgmt.service;

import miu.edu.studentmgmt.model.Student;

import java.util.List;

public interface StudentService {
     Student saveStudent(Student student);

     List<Student> findAllStudents();

}
