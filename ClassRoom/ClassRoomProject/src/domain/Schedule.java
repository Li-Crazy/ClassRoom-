package domain;

import java.sql.Timestamp;

public class Schedule {

	public Schedule(String scheduleid, String courseid, String classroomid,
			String classid, String teacherid, String schooltime) {
		super();
		this.scheduleid = scheduleid;
		this.courseid = courseid;
		this.classroomid = classroomid;
		this.classid = classid;
		this.teacherid = teacherid;
		this.schooltime = schooltime;
	}
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String scheduleid;
	private String courseid;
	private String classroomid;
	private String classid;
	private String teacherid;
	private String schooltime;
	public String getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
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
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getSchooltime() {
		return schooltime;
	}
	public void setSchooltime(String schooltime) {
		this.schooltime = schooltime;
	}
	@Override
	public String toString() {
		return "Schedule [scheduleid=" + scheduleid + ", courseid=" + courseid
				+ ", classroomid=" + classroomid + ", classid=" + classid
				+ ", teacherid=" + teacherid + ", schooltime=" + schooltime
				+ "]";
	}
	
}
