package business;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import domain.Admin;
import domain.Application;
import domain.Course;
import domain.Classroom;
import domain.Class;
import domain.Teacher;
import domain.Student;
import domain.Schedule;
import dao.*;

public class WebImpl implements Web {
	private AdminDao adminDao;
	private ApplicationDao applicationDao;
	private ClassDao classDao;
	private ClassroomDao classroomDao;
	private CourseDao courseDao;
	private ScheduleDao scheduleDao;
	private StudentDao studentDao;
	private TeacherDao teacherDao;
	public WebImpl() {
		adminDao = new AdminDao();
		applicationDao = new ApplicationDao();
		classDao = new ClassDao();
		classroomDao = new ClassroomDao();
		courseDao=new CourseDao();
		scheduleDao=new ScheduleDao();
		studentDao=new StudentDao();
		teacherDao=new TeacherDao();
	}

	public Admin getAdmin(String adminId) throws Exception {
		return adminDao.getAdmin(adminId);
	}
	public List<Admin> getAllAdmin() throws Exception {
		// TODO Auto-generated method stub
		return adminDao.getAllAdmin();
	}

	public Student getStudent(String studentId) throws Exception {
		return studentDao.getStudent(studentId);
	}
	public List<Student> getAllStudent() throws Exception {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	public Teacher getTeacher(String teacherId) throws Exception {
		return teacherDao.getTeacher(teacherId);
	}
	public List<Teacher> getAllTeacher() throws Exception {
		// TODO Auto-generated method stub
		return teacherDao.getAllTeacher();
	}

	public Class getClass(String classId) throws Exception {
		return classDao.getClass(classId);
	}
	public List<Class> getAllClass() throws Exception {
		// TODO Auto-generated method stub
		return classDao.getAllClass();
	}

	public Classroom getClassroom(String classroomId) throws Exception {
		return classroomDao.getClassroom(classroomId);
	}
	public List<Classroom> getAllClassroom() throws Exception {
		// TODO Auto-generated method stub
		return classroomDao.getAllClassroom();
	}
	public List<Classroom> getClassroomBySchoolTime(String SchoolTime) throws Exception{
		// TODO Auto-generated method stub
		return classroomDao.getClassroomBySchoolTime(SchoolTime);
	}
	
	public Course getCourse(String courseId) throws Exception {
		return courseDao.getCourse(courseId);
	}
	public List<Course> getAllCourse() throws Exception {
		// TODO Auto-generated method stub
		return courseDao.getAllCourse();
	}
	
	@Override
	public Schedule getSchedule(String scheduleId) throws Exception {
		// TODO Auto-generated method stub
		return scheduleDao.getSchedule(scheduleId);
	}
	
	public List<Schedule> getScheduleByClass(String classId) throws Exception {
		// TODO Auto-generated method stub
		return scheduleDao.getScheduleByClass(classId);
	}
	
	public List<Schedule> getScheduleByClassroom(String ClassroomID) throws Exception {
		// TODO Auto-generated method stub
		return scheduleDao.getScheduleByClassroom(ClassroomID);
	}
	
	public List<Schedule> getScheduleBySchooltime(String Schooltime) throws Exception {
		// TODO Auto-generated method stub
		return scheduleDao.getScheduleBySchooltime(Schooltime);
	}
	
	public List<Schedule> getScheduleByTeacher(String teacherId) throws Exception {
		// TODO Auto-generated method stub
		return scheduleDao.getScheduleByTeacher(teacherId);
	}

	@Override
	public List<Schedule> getAllSchedule() throws Exception {
		// TODO Auto-generated method stub
		return scheduleDao.getAllSchedule();
	}
	
	public Application getApplication(String teacherid) throws Exception {
		return applicationDao.getApplication(teacherid);
	}
	public List<Application> getAllApplication() throws Exception {
		// TODO Auto-generated method stub
		return applicationDao.getAllApplication();
	}
	

	public Admin addAdmin(String adminID,String password,String adminName) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.addAdmin( adminID, password, adminName);
	}

	public Application addApplication(String teacherID, String courseID, String classroomID,String newClassroomID, String schoolTime, String newSchoolTime) throws Exception {
		return applicationDao.addApplication(teacherID,courseID,classroomID,newClassroomID,schoolTime,newSchoolTime);
	}

	public Class addClass(String classID,String className,String amount,String major,String department) throws Exception {
		return classDao.addClass( classID, className, amount, major, department);
	}

	public Classroom addClassroom(String classroomID, String amount,String multimedia) throws Exception {
		return classroomDao.addClassroom( classroomID,  amount, multimedia);
	}

	public Course addCourse(String CourseID,String CourseName,String TeacherID) throws Exception {
		return courseDao.addCourse( CourseID, CourseName, TeacherID);
	}

	public Schedule addSchedule(String ScheduleID,String CourseID,String ClassroomID,String ClassID,String TeacherID,String SchoolTime) throws Exception {
		return scheduleDao.addSchedule( ScheduleID, CourseID, ClassroomID, ClassID, TeacherID, SchoolTime);
	}

	public Student addStudent(String StudentID,String Password,String Department,String StudentName) throws Exception {
		return studentDao.addStudent( StudentID, Password, Department, StudentName);
	}

	public Teacher addTeacher(String TeacherID,String Password,String Department,String TeacherName) throws Exception {
		// TODO Auto-generated method stub
		return teacherDao.addTeacher(TeacherID,Password,Department,TeacherName);
	}

	public Admin deleteAdmin(String adminID) throws Exception {
		return adminDao.deleteAdmin(adminID);
	}

	public Student deleteStudent(String StudentID) throws Exception {
		return studentDao.deleteStudent(StudentID);
	}

	public Teacher deleteTeacher(String TeacherID) throws Exception {
		// TODO Auto-generated method stub
		return teacherDao.deleteTeacher(TeacherID);
	}

	public Class deleteClass(String classID) throws Exception {
		return classDao.deleteClass(classID);
	}

	public Classroom deleteClassroom(String classroomID) throws Exception {
		return classroomDao.deleteClassroom( classroomID);
	}

	public Course deleteCourse(String CourseID) throws Exception {
		// TODO Auto-generated method stub
		return courseDao.deleteCourse( CourseID);
	}

	public Schedule deleteSchedule(String ScheduleID) throws Exception {
		return scheduleDao.deleteSchedule( ScheduleID);
	}

	public Application deleteApplication(String teacherID) throws Exception {
		// TODO Auto-generated method stub
		return applicationDao.deleteApplication(teacherID);
	}

	public Admin updateAdmin(String adminID,String password,String adminName) throws Exception {
		return adminDao.updateAdmin( adminID, password, adminName);
	}

	public Student updateStudent(String StudentID,String Password,String Department,String StudentName) throws Exception {
		return studentDao.updateStudent( StudentID, Password, Department, StudentName);
	}

	public Teacher updateTeacher(String TeacherID,String Password,String Department,String TeacherName) throws Exception{
		// TODO Auto-generated method stub
		return teacherDao.updateTeacher(TeacherID,Password,Department,TeacherName);
	}

	public Class updateClass(String classID,String className,String amount,String major,String department) throws Exception {
		return classDao.updateClass( classID, className, amount, major, department);
	}

	public Classroom updateClassroom(String classroomID, String amount,String multimedia) throws Exception {
		return classroomDao.updateClassroom( classroomID,  amount, multimedia);
	}

	public Course updateCourse(String CourseID,String CourseName,String TeacherID) throws Exception {
		return courseDao.updateCourse( CourseID, CourseName, TeacherID);
	}

	public Schedule updateSchedule(String ScheduleID,String CourseID,String ClassroomID,String ClassID,String TeacherID,String SchoolTime) throws Exception {
		return scheduleDao.updateSchedule( ScheduleID, CourseID, ClassroomID, ClassID, TeacherID, SchoolTime);
	}

	
}
