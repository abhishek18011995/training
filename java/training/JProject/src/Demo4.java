
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Demo4 {
	public static void main(String[] args) {
		try {
			//load the driver nad register to Driverrmager
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver is not loaded");
		}
		
		Connection conn=null;
		Statement statement=null;
		PreparedStatement prepare=null;
		
		try {
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
		if(conn!=null){
	prepare= conn.prepareStatement("update student set name=? where id=?");
	Scanner sc=new Scanner(System.in);
	int i=0;
	System.out.println("Enter your name update");
	String name=sc.nextLine();
	prepare.setString(1,name );
	//while(i<5){
		System.out.println("Enter your id to which user");
	int id= Integer.parseInt(sc.nextLine());
	prepare.setInt(2, id);
   int b=prepare.executeUpdate();
   System.out.println(b+" record added");
	i++;
	//}
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot able connect to database ");
		}finally{
			
			try {
				if(conn!=null){
					
				prepare.close();
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while closing the connection");
			}
		}
		
		
	}
}
