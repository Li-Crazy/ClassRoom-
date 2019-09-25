package domain;

public class Class {

	public Class(String classid, String classname, String amount,
			String department, String major) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.amount = amount;
		this.department = department;
		this.major = major;
	}
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String classid;
	private String classname;
	private String amount;
	private String department;
	private String major;
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Class [classid=" + classid + ", classname=" + classname
				+ ", amount=" + amount + ", department=" + department
				+ ", major=" + major + "]";
	}
	
}
