package com.sharekahn.vo;

import java.sql.*;

public class DAO {
	public Connection conn=null;
	
	public int validateLogin(LoginDetails login) throws ClassNotFoundException, SQLException{
		int flag=0;
		String uname=login.getUsername();
		String pass=login.getPassword();
		//String query="select username,passward from user_details where username="+uname+" or passward="+pass;
			
		String query="select username,passward from user_details where username=? and passward=?";
	Class.forName("com.mysql.jdbc.Driver");
conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
PreparedStatement pstmt=	conn.prepareStatement(query);
	pstmt.setString(1, uname);
	pstmt.setString(2, pass);
	ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			
			flag=1;
		}else{
			flag=0;
			
		}
		return flag;
		
	}
    int saveUserDetails(Registration registration) throws ClassNotFoundException, SQLException{
    	int flag=0;
    	String query="insert into registration(username,fullname" +
    			",email,address)values(?,?,?,?)";
    	Class.forName("com.mysql.jdbc.Driver");
    conn=	DriverManager.getConnection
    ("jdbc:mysql://localhost:3306/student", "root", "password-1");
    PreparedStatement pstmt=	conn.prepareStatement(query);
    	pstmt.setString(1,registration.getUsername());
    	pstmt.setString(2,registration.getFullname());
    	pstmt.setString(3,registration.getEmail());
    	pstmt.setString(4,registration.getAddress());
    	flag=pstmt.executeUpdate();
    	
    	
    	return flag;
    }
	
	
	
	
	
}
