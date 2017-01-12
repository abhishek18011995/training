import java.util.Scanner;


public class constructor11{

	String name;
	String roll;
	Double fees;
	Scanner scan=new Scanner(System.in);
	
	//public static void main(String[] args) {
public constructor11(String name,String roll,Double fees)
	{
	System.out.println("enter the name");
	String s3=scan.nextLine();
	this.name=name;
	System.out.println("enter the roll");
	String s4=scan.nextLine();
	this.roll=roll;
	System.out.println("enter the fees");
	Double d1=scan.nextDouble();
	this.fees=fees;
	}
/*public constructor11(String roll)
{

System.out.println("enter the roll");
String s4=scan.nextLine();
this.roll=roll;

}
public constructor11(Double fees)
{


System.out.println("enter the fees");
Double d1=scan.nextDouble();
this.fees=fees;
}
*/
	}

//}