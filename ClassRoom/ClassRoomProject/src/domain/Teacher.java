package domain;

public class Teacher {

	public Teacher(String teacherid, String teachername, String password,
			String department) {
		super();
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.password = password;
		this.department = department;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String teacherid;
	private String teachername;
	private String password;
	private String department;
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
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
		return "Teacher [teacherid=" + teacherid + ", teachername="
				+ teachername + ", password=" + password + ", department="
				+ department + "]";
	}
	
}
