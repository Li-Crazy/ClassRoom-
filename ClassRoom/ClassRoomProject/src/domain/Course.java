package domain;

public class Course {

	public Course(String courseid, String coursename, String teacherid) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.teacherid = teacherid;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String courseid;
	private String coursename;
	private String teacherid;
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename
				+ ", teacherid=" + teacherid + "]";
	}
	
	

}
