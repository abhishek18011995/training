import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class displaydemo {

	
	
	public static void main(String[] args) {
		List<Student> listStudent=new ArrayList<Student>();
		try{
			//load the driver nad register to Driverrmager
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver is not loaded");
		}
		
		Connection conn=null;
		Statement statement=null;
		try {
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password-1");
		if(conn!=null){
	statement=	conn.createStatement();	
		String q="selecT * from student";
		ResultSet rs=   statement.executeQuery(q);
		while(rs.next()){
		int id=	rs.getInt("id");
		//int id=	rs.getInt("id");
		String name= rs.getString("name");
		String phone= rs.getString("phone");
		String email= rs.getString("email");
		double fees=rs.getDouble("fees");
	String gender=	rs.getString("gender");
	char c=gender.charAt(0);
	Student student=new Student(id, name, phone, email, fees, c);
	listStudent.add(student);	
			
	System.out.println(id +" "+name+" "+phone+" "+email+" "+fees+" "+gender);
	
	System.out.println(id+"  "+name);
		}
		}
		System.out.println(listStudent);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot able connect to database ");
		}finally{
			
			try {
				if(conn!=null)
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while closing the connection");
			}
		}
		
		}}
	

