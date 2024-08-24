package com.Ass.IITB.CourseIITB.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="CourseInstance ")
public class CourseInstance  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="course_id")
       private int id;
 
  @Column(name="year")
 private int year;

 @Column(name="semester")
 private int semester;
 @ManyToOne
 @JoinColumn(name = "course_id")

 @Column(name="courseid")
 private int CourseId;



}
