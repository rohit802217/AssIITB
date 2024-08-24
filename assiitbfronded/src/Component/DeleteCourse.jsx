import React from 'react'
import { useState } from 'react';
import { deleteCourse } from './api';

function DeleteCourse() {
  const [courseId, setCourseId] = useState('');

    const handleDelete = () => {
        deleteCourse(courseId).then(() => {
            alert('Course deleted successfully!');
        });
    };
  return (
    <div> 
 <div>
            <h1>Delete Course</h1>
            <input type="number" placeholder="Course ID" value={courseId} onChange={(e) => setCourseId(e.target.value)} />
            <button onClick={handleDelete}>Delete</button>
        </div>


    </div>
  )
}

export default DeleteCourse