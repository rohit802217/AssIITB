import React from 'react'
<div>
            <h1>Create Instance</h1>
            <input type="number" placeholder="Year" value={year} onChange={(e) => setYear(e.target.value)} />
            <input type="number" placeholder="Semester" value={semester} onChange={(e) => setSemester(e.target.value)} />
            <input type="number" placeholder="Course ID" value={courseId} onChange={(e) => setCourseId(e.target.value)} />
            <button onClick={handleSubmit}>Create</button>
        </div>
function CreateInstance() {
  const [year, setYear] = useState('');
  const [semester, setSemester] = useState('');
  const [courseId, setCourseId] = useState('');

  const handleSubmit = () => {
      const instance = { year, semester, course: { id: courseId } };
      createInstance(instance).then(response => {
          alert('Instance created successfully!');
      });
  };
  
  
  
  return (
    <div> 

<div>
            <h1>Create Instance</h1>
            <input type="number" placeholder="Year" value={year} onChange={(e) => setYear(e.target.value)} />
            <input type="number" placeholder="Semester" value={semester} onChange={(e) => setSemester(e.target.value)} />
            <input type="number" placeholder="Course ID" value={courseId} onChange={(e) => setCourseId(e.target.value)} />
            <button onClick={handleSubmit}>Create</button>
        </div>


    </div>
  )
}

export default CreateInstance