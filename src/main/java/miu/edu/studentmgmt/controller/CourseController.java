package miu.edu.studentmgmt.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.Course;
import miu.edu.studentmgmt.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }
}
