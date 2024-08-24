package com.Ass.IITB.CourseIITB.CourseServiseImp;


import com.Ass.IITB.CourseIITB.CourseRepository.CourseInstanceRepository;
import com.Ass.IITB.CourseIITB.CourseService.CourseInstanceService;
import com.Ass.IITB.CourseIITB.Entity.CourseInstance;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseInstanceServiceImpl implements CourseInstanceService {

    @Autowired
    private CourseInstanceRepository instanceRepository;

    @Override
    public CourseInstance createInstance(CourseInstance instance) {
        return instanceRepository.save(instance);
    }

    @Override
    public List<CourseInstance> getInstances(int year, int semester) {
        return instanceRepository.findByYearAndSemester(year, semester);
    }

    @Override
    public Optional<CourseInstance> getInstance(int year, int semester, Long id) {
        return instanceRepository.findById(id);
    }

    @Override
    public void deleteInstance(int year, int semester, Long id) {
        instanceRepository.deleteById(id);
    }
}
