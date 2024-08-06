package miu.edu.studentmgmt.service;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.Course;
import miu.edu.studentmgmt.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
