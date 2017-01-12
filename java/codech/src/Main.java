
import java.util.Scanner;




class Main { 

public static void main(String args[]) { 


			// fill the code
	

	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	String name=sc.nextLine();
	
	System.out.println("Enter salary:");
	double salary=Double.parseDouble(sc.nextLine());
	
	System.out.println("Enter department:");
	String department=sc.nextLine();
	
	System.out.println("Enter age:");
	int age=Integer.parseInt(sc.nextLine());
	
	
	
	System.out.println("Enter designation:");
	String designation=sc.nextLine();
	
	Employee book=new Employee();
	book.setName(name);
	book.setSalary(salary);
	book.setDepartment(department);
	book.setAge(age);
	book.setDesignation(designation);
	
	System.out.println("Employee Details");
	System.out.println("Name:"+book.getName());
	System.out.println("Salary:"+Math.round(+book.getSalary()*100.0)/100.0);
	System.out.println("Department:"+book.getDepartment());
	System.out.println("Age:"+book.getAge());
	System.out.println("Designation:"+book.getDesignation());
	
	

	System.out.println("Verify and update Employee details");
	System.out.println("Menu");

	System.out.println("1) Update name");
	System.out.println("2) Update salary");
	System.out.println("3) Update department");
	System.out.println("4) Update age");
	System.out.println("5) Update designation");
	System.out.println("6) Exit");
	int x=sc.nextInt();
	System.out.println("\n");
	switch (x) {
	case 1:
		System.out.println("The current name is "+book.getName());
		System.out.println("Enter the name");
		name=sc.nextLine();
		book.setName(name);
		
	case 2:
		System.out.println("The current salary is "+book.getSalary());
		System.out.println("Enter the salary");
		salary=Double.parseDouble(sc.nextLine());
		book.setSalary(salary);
		
		break;
		
	case 3:
		System.out.println("The current department is "+book.getDepartment());
		System.out.println("Enter the department");
		department=sc.nextLine();
		book.setDepartment(department);
		break;
		
	case 4:
		System.out.println("The current age is "+book.getAge());
		System.out.println("Enter the age");
		age=Integer.parseInt(sc.nextLine());
		book.setAge(age);
		break;
	case 5:
		System.out.println("The current designation is "+book.getDesignation());
		System.out.println("Enter the designation");
		designation=sc.nextLine();
		book.setDesignation(designation);
		break;
	case 6:
		break;
	default:
		break;
	}
	

	/*
			System.out.println("The current name is ");
			System.out.println("Enter the name");
			
			System.out.printf("The current salary is %.2f\n");
			System.out.println("Enter the salary");
			
			System.out.println("The current department is ");
			System.out.println("Enter the  department");
		
			System.out.println("The current age is ");
			System.out.println("Enter the age");
			
			System.out.println("The current designation is ");
			System.out.println("Enter the designation");
			*/
		System.out.println("The employee details are");
		System.out.println("Employee Details");
		System.out.println("Name:"+book.getName());
		System.out.println("Salary:"+Math.round(+book.getSalary()*100.0)/100.0);
		System.out.println("Department:"+book.getDepartment());
		System.out.println("Age:"+book.getAge());
		System.out.println("Designation:"+book.getDesignation());


} 
}

