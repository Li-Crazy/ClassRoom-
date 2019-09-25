package business;

import java.sql.Timestamp;
import java.util.*;

import domain.*;
import domain.Class;

public interface Web {
	Admin getAdmin(String adminId) throws Exception;
	List<Admin> getAllAdmin() throws Exception;
	Admin addAdmin(String adminID,String password,String adminName) throws Exception;
	Admin updateAdmin(String adminID,String password,String adminName) throws Exception;
	Admin deleteAdmin(String adminID) throws Exception;


	Student getStudent(String studentId) throws Exception;
	List<Student> getAllStudent() throws Exception;
	Student addStudent(String StudentID,String Password,String Department,String StudentName) throws Exception;
	Student updateStudent(String StudentID,String Password,String Department,String StudentName) throws Exception;
	Student deleteStudent(String StudentID) throws Exception;
	
	Teacher getTeacher(String teacherId) throws Exception;
	List<Teacher> getAllTeacher() throws Exception;
	Teacher addTeacher(String TeacherID,String Password,String Department,String TeacherName) throws Exception;
	Teacher updateTeacher(String TeacherID,String Password,String Department,String TeacherName) throws Exception;
	Teacher deleteTeacher(String TeacherID) throws Exception;
	
	Class getClass(String classId) throws Exception;
	List<Class> getAllClass() throws Exception;
	Class addClass(String classID,String className,String amount,String major,String department) throws Exception;
	Class updateClass(String classID,String className,String amount,String major,String department) throws Exception;
	Class deleteClass(String classID) throws Exception;
	
	Classroom getClassroom(String classroomId) throws Exception;
	List<Classroom> getAllClassroom() throws Exception;
	List<Classroom> getClassroomBySchoolTime(String SchoolTime) throws Exception;
	Classroom addClassroom(String classroomID, String amount,String multimedia) throws Exception;
	Classroom updateClassroom(String classroomID, String amount,String multimedia) throws Exception;
	Classroom deleteClassroom(String classroomID) throws Exception;
	
	Course getCourse(String courseId) throws Exception;
	List<Course> getAllCourse() throws Exception;
	Course addCourse(String CourseID,String CourseName,String TeacherID) throws Exception;
	Course updateCourse(String CourseID,String CourseName,String TeacherID) throws Exception;
	Course deleteCourse(String CourseID) throws Exception;

	Schedule getSchedule(String scheduleId) throws Exception;
	List<Schedule> getScheduleByClass(String classId) throws Exception;
	List<Schedule> getScheduleByTeacher(String teacherId) throws Exception;
	List<Schedule> getAllSchedule() throws Exception;
	List<Schedule> getScheduleByClassroom(String ClassroomID) throws Exception;
	List<Schedule> getScheduleBySchooltime(String Schooltime) throws Exception;
	
	Schedule addSchedule(String ScheduleID,String CourseID,String ClassroomID,String ClassID,String TeacherID,String SchoolTime) throws Exception;
	Schedule deleteSchedule(String ScheduleID) throws Exception;
	Schedule updateSchedule(String ScheduleID,String CourseID,String ClassroomID,String ClassID,String TeacherID,String SchoolTime) throws Exception;
	
	Application getApplication(String teacherID) throws Exception;
	List<Application> getAllApplication() throws Exception;
	Application addApplication(String teacherID, String courseID, String classroomID,String newClassroomID, String schoolTime, String newSchoolTime) throws Exception;
	Application deleteApplication(String TeacherID) throws Exception;

}
