package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import domain.Application;

public class ApplicationDao extends BaseDao {
	public List<Application> select(String sql) throws Exception {
		List<Application> result = new ArrayList<Application>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Application a = new Application();
			a.setTeacherid(rs.getString("teacherid"));
			a.setCourseid(rs.getString("courseid"));
			a.setClassroomid(rs.getString("classroomid"));
			a.setNewclassroomid(rs.getString("newclassroomid"));
			a.setSchooltime(rs.getString("schooltime"));
			a.setNewschooltime(rs.getString("newschooltime"));
			result.add(a);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Application addApplication(String teacherID, String courseID, String classroomID,
			String newClassroomID, String schoolTime, String newSchoolTime) throws Exception{
		Application application = new Application();
		Connection conn=null;
		PreparedStatement ps=null;
		schoolTime = getDate(schoolTime);
		newSchoolTime = getDate(newSchoolTime);
		String sql="INSERT INTO application values('"+teacherID+"','"+courseID+"','"+classroomID+"','" +newClassroomID+"','"+schoolTime+"','"+newSchoolTime+"')";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return application;
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
	
	public Application deleteApplication(String TeacherID) throws Exception{
		Application application = new Application();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from application where teacherID='"+TeacherID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		 //从obj属性得到需要的数据 
		ps.executeUpdate();
		ps.close();
		conn.close();   
		return null;
	}

	public Application getApplication(String teacherID) throws Exception {
		Application a = null;
		List<Application> list = select("select * from application where teacherID='" + teacherID
				+ "'");
		if (list != null&&!list.isEmpty())
			a = (Application) list.get(0);
		return a;
	}
	
	public List<Application> getAllApplication() throws Exception{
		List<Application> list=select("select * from application");
		return list;
	}

}
