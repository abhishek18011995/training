import java.io.IOException;
import java.util.Scanner;


class Main { 

public static void main(String args[]) throws IOException  { 

//fill the code
	String name;
    String username;
    String password;
    String email;
    String phonenumber;
    String deliveryAddress;
	Integer bonusPoints;
	String creditDetails;
	String description;
	Double rating;
	Integer type;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name of the user :");
	name=s.nextLine();
	System.out.println("Enter the username :");
	username=s.nextLine();
	System.out.println("Enter the password :");
	password=s.nextLine();
	System.out.println("Enter the email :");
	email=s.nextLine();
	System.out.println("Enter the phonenumber :");
	phonenumber=s.nextLine();
	System.out.println("Enter the type of user");
	System.out.println("1.Customer");
	System.out.println("2.Seller");
	type=Integer.parseInt(s.nextLine());
	if(type==1)
	{
		System.out.println("Enter the delivery address :");
		deliveryAddress=s.nextLine();
		System.out.println("Enter the bonus points :");
		bonusPoints=Integer.parseInt(s.nextLine());
		System.out.println("Enter the credit details :");
		creditDetails=s.nextLine();
Customer obj=new Customer(name, username, password, email, phonenumber, deliveryAddress, creditDetails, bonusPoints);
obj.displayDetails();
	
	}else{
		
 description=	s.nextLine();
	rating=	Double.parseDouble(s.nextLine());
	Seller obj1=new Seller(name, username, password, email, phonenumber, description, rating);
	obj1.displayDetails();
	}
	}

 
}

