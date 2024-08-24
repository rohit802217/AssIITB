   import './App.css'
   import CourseList from './Component/CourseList'
   import CreateCourse from './Component/CreateCourse'
   import InstanceList from './Component/InstanceList'

   import CreateInstance from './Component/CreateInstance'
   import ViewCourseDetails from './Component/ViewCourseDetails'
   import DeleteCourse from './Component/DeleteCourse'
   import './api'
function App() {
 
  return (
    <>
    <div className="container">
      <div className="row">
        <div >
        <CreateCourse></CreateCourse>

        </div>
        <div >
        <CourseList></CourseList>

        </div>
        <div>
        <CreateInstance></CreateInstance>

        </div>
        <div>
        <InstanceList></InstanceList>

        </div>
        <div>
        <ViewCourseDetails></ViewCourseDetails>

        </div>

      <div>
      <DeleteCourse></DeleteCourse>

      </div>
      </div>
    </div>


       
    </>
  )
}

export default App
