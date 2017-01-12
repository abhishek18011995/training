import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.Connection;


public class jdbc1 {

	
	public static void main(String[] args) {
		List<Student> listStudent=new ArrayList<Student>();
		Connection con=null;
		ResultSet rs=null;
	Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
				if(con!=null)
				{
					System.out.println("connection established");
					stmt= con.createStatement();
					String qry="select * from st1";
					rs=stmt.executeQuery(qry);
					while(rs.next())
					{
						String name=rs.getString("name");
						String roll=rs.getString("roll");
						Double fees=rs.getDouble("fees");
						System.out.println(name+""+roll+""+fees);
						Student student=new Student(name,roll,fees);
						listStudent.add(student);
					}
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
