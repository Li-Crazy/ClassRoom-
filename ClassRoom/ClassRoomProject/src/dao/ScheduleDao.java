package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import domain.Schedule;

public class ScheduleDao extends BaseDao {
	public List<Schedule> select(String sql) throws Exception {
		List<Schedule> result = new ArrayList<Schedule>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Schedule s = new Schedule();
			s.setScheduleid(rs.getString("scheduleID"));
			s.setTeacherid(rs.getString("teacherID"));
			s.setCourseid(rs.getString("courseID"));
			s.setClassroomid(rs.getString("classroomID"));
			s.setClassid(rs.getString("classID"));
			s.setSchooltime(rs.getString("schoolTime"));
			result.add(s);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Schedule addSchedule(String ScheduleID,String CourseID,String ClassroomID,String ClassID,String TeacherID,String SchoolTime) throws Exception{
		Schedule schedule = new Schedule();
		Connection conn = null;
		PreparedStatement ps = null;
		SchoolTime = getDate(SchoolTime);

		String sql = "INSERT INTO schedule values('"+ScheduleID+"','"+CourseID+"','"+ClassroomID+"','"+ClassID+"','"+TeacherID+"','"+SchoolTime+"')";
		conn = getConnection();
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
	
	}
	public String getDate(String Time) {
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            if(Time!=null){
                Time=sf.format(Time);
            }
        } catch (Exception e) {
        }
        return Time;
    }
	
	public Schedule updateSchedule(String ScheduleID,String CourseID,String ClassroomID,String ClassID,String TeacherID,String SchoolTime) throws Exception{
		Schedule schedule = new Schedule();
		Connection conn=null;
		PreparedStatement ps=null;
		SchoolTime = getDate(SchoolTime);

		String sql="UPDATE schedule set teacherID='"+TeacherID+"',courseID='"+CourseID+"',classroomID='"+ClassroomID+"',classID='"+ClassID+"',schoolTime='"+SchoolTime+"' where scheduleID='"+ScheduleID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Schedule deleteSchedule(String ScheduleID) throws Exception{
		Schedule schedule = new Schedule();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from schedule where scheduleID='"+ScheduleID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;   	
	}
	public Schedule getSchedule(String ScheduleID) throws Exception {
		Schedule c = null;
		List<Schedule> list = select("select * from schedule where scheduleid='" + ScheduleID
				+ "'");
		if (list != null&&!list.isEmpty())
			c = (Schedule) list.get(0);
		return c;
	}
	public List<Schedule> getScheduleByClass(String ClassID) throws Exception {
		List<Schedule> list1 = select("select * from schedule where classid='" + ClassID
				+ "'");
		return list1;
	}
	
	public List<Schedule> getScheduleByTeacher(String TeacherID) throws Exception {
		List<Schedule> list2 = select("select * from schedule where teacherid='" + TeacherID
				+ "'");
		return list2;
	}
	
	public List<Schedule> getAllSchedule() throws Exception {
		List<Schedule> list=select("select * from schedule");
		return list;
	}
	
	public List<Schedule> getScheduleByClassroom(String ClassroomID) throws Exception {
		List<Schedule> list3 = select("select * from schedule where classroomid='" + ClassroomID
				+ "'");
		return list3;
	}
	
	public List<Schedule> getScheduleBySchooltime(String Schooltime) throws Exception {
		Schooltime = getDate(Schooltime);
		List<Schedule> list4 = select("select * from schedule where schooltime='" + Schooltime
				+ "'");
		return list4;
	}

}
