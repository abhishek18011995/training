import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCDemo1 {

	
	
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
	prepare= conn.prepareStatement("insert into student values(?,?,?,?,?,?)");
	Scanner sc=new Scanner(System.in);
	int i=0;
	//while(i<5){
		System.out.println("Enter your id");
	int id= Integer.parseInt(sc.nextLine());
	prepare.setInt(1, id);

	System.out.println("Enter your name");
	String name=sc.nextLine();
	prepare.setString(2,name );

	System.out.println("Enter your phone");
	String phone=sc.nextLine();
	
	prepare.setString(3,phone);

	System.out.println("Enter your email");
	String email=sc.nextLine();
	
	prepare.setString(4,email );

	System.out.println("Enter your fees");
	double fees = Double.parseDouble( sc.nextLine());
	prepare.setDouble(5, fees);

	System.out.println("Enter your gender");
	char gender=sc.nextLine().charAt(0);
   prepare.setString(6,gender+"" );
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
