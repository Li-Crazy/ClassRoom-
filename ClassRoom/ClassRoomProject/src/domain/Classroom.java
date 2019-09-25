package domain;

public class Classroom {

	public Classroom(String classroomid, String amount, String multimedia) {
		super();
		this.classroomid = classroomid;
		this.amount = amount;
		this.multimedia = multimedia;
	}
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String classroomid;
	private String amount;
	private String multimedia;
	public String getClassroomid() {
		return classroomid;
	}
	public void setClassroomid(String classroomid) {
		this.classroomid = classroomid;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(String multimedia) {
		this.multimedia = multimedia;
	}
	@Override
	public String toString() {
		return "Classroom [classroomid=" + classroomid + ", amount=" + amount
				+ ", multimedia=" + multimedia + "]";
	}
	
	

}
