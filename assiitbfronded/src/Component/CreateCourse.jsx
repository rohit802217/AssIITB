import React from 'react'
import React, { useState } from 'react';
import { createCourse } from './api';
function CreateCourse() {

  const [title, setTitle] = useState('');
  const [courseCode, setCourseCode] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = () => {
      const course = { title, courseCode, description };
      createCourse(course).then(response => {
          alert('Course created successfully!');
      });
  };
  return (
    <div> 

<div>
            <h1>Create Course</h1>
            <input type="text" placeholder="Title" value={title} onChange={(e) => setTitle(e.target.value)} />
            <input type="text" placeholder="Course Code" value={courseCode} onChange={(e) => setCourseCode(e.target.value)} />
            <textarea placeholder="Description" value={description} onChange={(e) => setDescription(e.target.value)}></textarea>
            <button onClick={handleSubmit}>Create</button>
        </div>







    </div>
  )
}

export default CreateCourse