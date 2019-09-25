package domain;

public class Admin {

	public Admin(String adminid, String adminname, String password) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String adminid;
	private String adminname;
	private String password;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname
				+ ", password=" + password + "]";
	}
	
	
	
}
