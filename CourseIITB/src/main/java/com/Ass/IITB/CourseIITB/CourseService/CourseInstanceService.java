package com.Ass.IITB.CourseIITB.CourseService;

 
import com.Ass.IITB.CourseIITB.Entity.CourseInstance;
import java.util.List;
import java.util.Optional;

public interface CourseInstanceService {
    CourseInstance createInstance(CourseInstance instance);
    List<CourseInstance> getInstances(int year, int semester);
    Optional<CourseInstance> getInstance(int year, int semester, Long id);
    void deleteInstance(int year, int semester, Long id);
}
