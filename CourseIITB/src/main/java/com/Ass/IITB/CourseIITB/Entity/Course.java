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
@Table(name="Course")
public class Course {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column (name="course_id")
    private int id;
    @Column(name="TitleCourse")
    private String Title;

    @Column(name="CourseCode")
    private String  CourseCode;

    @Column(name="Description")
    private String  Description;

  


}
