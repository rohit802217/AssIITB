import React from 'react'
import React, { useEffect, useState } from 'react';
import { listInstances } from './api';
function InstanceList({ year, semester }) {
  const [instances, setInstances] = useState([]);

  useEffect(() => {
      listInstances(year, semester).then(response => setInstances(response.data));
  }, [year, semester]);


  return (
    <div> 
 <div>
            <h1>Instance List</h1>
            <ul>
                {instances.map(instance => (
                    <li key={instance.id}>Course ID: {instance.course.id}, Year: {instance.year}, Semester: {instance.semester}</li>
                ))}
            </ul>
        </div>

    </div>
  )
}

export default InstanceList