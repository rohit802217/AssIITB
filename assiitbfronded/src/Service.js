import axios from 'axios';

const   API_Coursedata = 'http://localhost:9090/api';

export const createCourse = (course) => axios.post(`${ API_Coursedata}/courses`, course);
export const createInstance = (instance) => axios.post(`${ API_Coursedata}/instances`, instance);
export const listCourses = () => axios.get(`${ API_Coursedata}/courses`);
export const getCourse = (id) => axios.get(`${ API_Coursedata}/courses/${id}`);
export const deleteCourse = (id) => axios.delete(`${ API_Coursedata}/courses/${id}`);
export const listInstances = (year, semester) => axios.get(`${ API_Coursedata}/instances/${year}/${semester}`);
export const getInstance = (year, semester, id) => axios.get(`${ API_Coursedata}/instances/${year}/${semester}/${id}`);
export const deleteInstance = (year, semester, id) => axios.delete(`${ API_Coursedata}/instances/${year}/${semester}/${id}`);
