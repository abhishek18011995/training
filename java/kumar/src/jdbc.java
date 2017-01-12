import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;


public class jdbc {

	
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
				if(con!=null)
				{
					System.out.println("connection established");
					stmt=con.createStatement();
					int count=stmt.executeUpdate("insert into st1 values('shravana','69',28888)");
					System.out.println("inserted");
					
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
