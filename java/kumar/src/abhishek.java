import java.util.Scanner;


public class abhishek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name,address,hobby;
int age;
name=sc.nextLine();
age=Integer.parseInt(sc.nextLine());
address=sc.nextLine();
hobby=sc.nextLine();

manoj obj=new manoj();
obj.setAddress(address);
obj.setName(name);
obj.setAge(age);
obj.setHobby(hobby);





	System.out.println(obj.getName());
System.out.println(obj.getAddress());
System.out.println(obj.getAge());
System.out.println(obj.getHobby());
	}

}
