import React from 'react'
import React, { useEffect, useState } from 'react';
import { listCourses } from './api';
function CourseList() {

  const [courses, setCourses] = useState([]);

  useEffect(() => {
    listCourses().then(response => setCourses(response.data));
  }, []);
  return (
    <>
      <div>
        <h1>Course List</h1>
        <ul>
          {courses.map(course => (
            <li key={course.id}>{course.title} - {course.courseCode}</li>
          ))}
        </ul>
      </div>




    </>
  )
}

export default CourseList