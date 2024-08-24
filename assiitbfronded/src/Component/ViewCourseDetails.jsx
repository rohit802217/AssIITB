import React from 'react'
import React, { useEffect, useState } from 'react';
import { getCourse } from './api';
function ViewCourseDetails({ id }) {
  const [course, setCourse] = useState(null);

  useEffect(() => {
      getCourse(id).then(response => setCourse(response.data));
  }, [id]);

  if (!course) return <div>Loading...</div>;
  
  return (
    <div> 
<div>
            <h1>Course Details</h1>
            <p>Title: {course.title}</p>
            <p>Course Code: {course.courseCode}</p>
            <p>Description: {course.description}</p>
        </div>



    </div>
  )
}

export default ViewCourseDetails