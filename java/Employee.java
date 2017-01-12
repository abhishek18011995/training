class Employee{

int id=784747;
double salary=84343;

public void printData()
{
System.out.println("id is: "+id);
System.out.println("salary is: "+salary);

}

public void print(){
System.out.println("before");
printData();
System.out.println("after");

}


public static void main(String array[])
{
Employee emp=new Employee();
emp.print();
System.out.println("id is: "+emp.id);
System.out.println("salary is: "+emp.salary);

}



}