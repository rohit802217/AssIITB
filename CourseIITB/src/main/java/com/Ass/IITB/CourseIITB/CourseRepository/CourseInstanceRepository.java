package com.Ass.IITB.CourseIITB.CourseRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ass.IITB.CourseIITB.Entity.CourseInstance;



public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
  List<CourseInstance> findByYearAndSemester(int year, int semester);
}
