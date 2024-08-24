package com.Ass.IITB.CourseIITB.CourseServiseImp;

 

import com.Ass.IITB.CourseIITB.Entity.Course;
import com.Ass.IITB.CourseIITB.CourseRepository.CourseRepository;
import com.Ass.IITB.CourseIITB.CourseService.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourse(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}