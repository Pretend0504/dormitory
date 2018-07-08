package com.DMUtil;
//连接数据库
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DMUtil {
  private String url = "jdbc:mysql://localhost:3306/dormitory?characterEncoding=utf8";
  private String userName = "root";//数据库用户名，默认“root”
  private String userPassword = "1234";//这里是MySQL密码
  private String jdbcName = "com.mysql.jdbc.Driver";
  
  public Connection getCon() throws Exception{
	  Class.forName(jdbcName);
	  Connection con = DriverManager.getConnection(url,userName,userPassword);
	  return con;
  }
  public void closeCon(Connection con) throws Exception{
	  if(con!=null){
		  con.close();
	  }
  }
  public static void main(String[] args){
	  DMUtil dmutil = new DMUtil();
	  Connection con = null;
	  try {
		con = dmutil.getCon();
		System.out.println("数据库连接成功！");
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		try {
			dmutil.closeCon(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  }
}
