package miu.edu.studentmgmt.service;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.Student;
import miu.edu.studentmgmt.repository.StudentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
    }

}
