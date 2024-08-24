package com.Ass.IITB.CourseIITB.CourseController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ass.IITB.CourseIITB.CourseRepository.CourseInstanceRepository;
import com.Ass.IITB.CourseIITB.Entity.CourseInstance;
@CrossOrigin
@RestController
@RequestMapping("/api/instances")
public class CourseInstanceController {
    @Autowired
    private CourseInstanceRepository instanceRepository;

    @PostMapping
    public CourseInstance createInstance(@RequestBody CourseInstance instance) {
        return instanceRepository.save(instance);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getInstances(@PathVariable int year, @PathVariable int semester) {
        return instanceRepository.findByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{id}")
    public CourseInstance getInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        return instanceRepository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{year}/{semester}/{id}")
    public void deleteInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        instanceRepository.deleteById(id);
    }
}
