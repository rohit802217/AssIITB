package com.Ass.IITB.CourseIITB.CourseService;

import com.Ass.IITB.CourseIITB.Entity.Course;
import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course createCourse(Course course);
    List<Course> getAllCourses();
    Optional<Course> getCourse(Long id);
    void deleteCourse(Long id);
}
