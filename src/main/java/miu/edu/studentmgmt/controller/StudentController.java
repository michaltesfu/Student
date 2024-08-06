package miu.edu.studentmgmt.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.Student;
import miu.edu.studentmgmt.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Student saveStudent(@Valid @RequestBody Student student){
        if (student.getTranscript() != null) {
            student.getTranscript().setStudent(student); // Set the back-reference
        }
        return studentService.saveStudent(student);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

}
