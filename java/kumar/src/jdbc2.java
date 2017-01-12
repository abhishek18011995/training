import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.jdbc.Connection;


public class jdbc2 {

	
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner scan=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
				if(con!=null)
				{
					//stmt=con.createStatement();
					System.out.println("Enter your name update");
				
					
					//System.out.println("inserted");
					System.out.println("enter the roll to which we have to change");
					stmt=con.prepareStatement("update st1 set name=? where roll=?");
	String name=scan.nextLine();
					
					stmt.setString(1, name);
					int roll=Integer.parseInt(scan.nextLine());
					stmt.setInt(2, roll);
					//String roll=scan.nextLine();
					//stmt.setString(1,roll);
					int b=stmt.executeUpdate();
					System.out.println(b+"record added");
				}
	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			System.out.println("error while getting connection");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot load the class");
		}finally{
			if(con!=null)
			{
				try {if(con!=null)
				{
					con.close();
					stmt.close();
				}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
