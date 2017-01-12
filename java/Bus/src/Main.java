import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
	
		String number=scanner.nextLine();
		System.out.println("Enter route");
		String route=scanner.nextLine();
		System.out.println("Enter bustype");
		String busType=scanner.nextLine();
		System.out.println("Enter noofseats");
		String ns=scanner.nextLine();
		int noofseat=Integer.parseInt(ns);
		System.out.println("Enter Color");
		String color=scanner.nextLine();
		
		Bus b=new Bus();
		b.setNumber(number);
		b.setNoOfSeats(noofseat);
		b.setBusType(busType);
		b.setRoute(route);
		b.setColr(color);
		System.out.println(b);
		
		
		System.out.println("Enter \n1 for  number 0r \n2 for seatcount" +
				" for 0r \n3 bus type or \n4 route or \n5 color");
	  int ch=Integer.parseInt(scanner.nextLine());
			
	  
	  switch(ch){
	  
	  case 1:
		  
		  System.out.println("Current bus numner is "+b.getNumber());
		  System.out.println("Enter new number");
		  String no=(scanner.nextLine());
		  b.setNumber(no);
		  System.out.println(b);
		  break;
		  
	  case 6:
		  System.exit(1);
		  break;
		  
	  
		  
	  
	  }
			
			
			
			
			
		
		
		
		
		

	}

}
