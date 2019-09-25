package domain;

public class Student {
	public Student(String studentid, String studentname, String password,
			String department) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.password = password;
		this.department = department;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String studentid;
	private String studentname;
	private String password;
	private String department;
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname="
				+ studentname + ", password=" + password + ", department="
				+ department + "]";
	}
	
	
}
