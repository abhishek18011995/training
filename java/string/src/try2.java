import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class try2{
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 Connection connection =null;
	 Statement statement=null;
	 PreparedStatement prepare=null;
 try {
	//Class.forName("com.mysql.jdbc.Driver");
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("driver cannot be loaded");
}
	try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
	if(connection!=null)
	{
		System.out.println("got the connection");
		statement=connection.createStatement();
		prepare=connection.prepareStatement("insert into st1 values(?,?,?)");
		String name1=scan.nextLine();
		prepare.setString(1,name1);
		String roll1=scan.nextLine();
		prepare.setString(2,roll1);
		Double fees1=scan.nextDouble();
		
		prepare.setDouble(3,fees1);
		int rs2=prepare.executeUpdate();
		System.out.println("prepare statement inserted");
		String s1="select * from st1 where roll='69'";
		String s2="insert into st1 values('tuntun','96',2222)";
		int rs1=statement.executeUpdate(s2);
		ResultSet rs=statement.executeQuery(s1);
		
		while(rs.next())
		{
			String name=rs.getString("name");
			String roll=rs.getString("roll");
			Double fees=rs.getDouble("fees");
			System.out.println(name+"  "+roll+"  "+fees);
		}
		
		System.out.println("inserted");
	
	}} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("driver could not be connected");
	} finally{
		if(connection!=null)
		{
			try {
				connection.close();
				statement.close();
				prepare.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error while closing connection");
			}
		}
	}
	 
 }
}