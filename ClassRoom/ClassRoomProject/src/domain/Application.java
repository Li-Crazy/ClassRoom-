package domain;

import java.sql.Timestamp;

public class Application {

	public Application(String teacherid, String courseid, String classroomid,
			String newclassroomid, String schooltime, String newschooltime) {
		super();
		this.teacherid = teacherid;
		this.courseid = courseid;
		this.classroomid = classroomid;
		this.newclassroomid = newclassroomid;
		this.schooltime = schooltime;
		this.newschooltime = newschooltime;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String teacherid;
	private String courseid;
	private String classroomid;
	private String newclassroomid;
	private String schooltime;
	private String newschooltime;
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getClassroomid() {
		return classroomid;
	}
	public void setClassroomid(String classroomid) {
		this.classroomid = classroomid;
	}
	public String getNewclassroomid() {
		return newclassroomid;
	}
	public void setNewclassroomid(String newclassroomid) {
		this.newclassroomid = newclassroomid;
	}
	public String getSchooltime() {
		return schooltime;
	}
	public void setSchooltime(String schooltime) {
		this.schooltime = schooltime;
	}
	public String getNewschooltime() {
		return newschooltime;
	}
	public void setNewschooltime(String newschooltime) {
		this.newschooltime = newschooltime;
	}
	@Override
	public String toString() {
		return "Application [teacherid=" + teacherid + ", courseid=" + courseid
				+ ", classroomid=" + classroomid + ", newclassroomid="
				+ newclassroomid + ", schooltime=" + schooltime
				+ ", newschooltime=" + newschooltime + "]";
	}
	
}
