import java.io.*;
import java.lang.*;
import java.util.*;
class Main
{
public static void main(String args[]) throws IOException
{
/* FILL MISSING CODE */
System.out.println("Enter the number of desktops");
Scanner sc= new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
List<DesktopPC> list=new ArrayList<DesktopPC>();
for(int i=0;i<n;i++)
{
//int i=0;
DesktopPC ds=new DesktopPC();
System.out.println("Enter the model of desktop "+(i+1));
String model=sc.nextLine();
ds.setModel(model);
System.out.println("Enter the ram size of desktop "+(i+1));
int ram=Integer.parseInt(sc.nextLine());
ds.setRamSize(ram);

System.out.println("Enter the hard disk capacity of desktop "+(i+1));
int hd=Integer.parseInt(sc.nextLine());
ds.setHardDiskCapacity(hd);
Processor p=new Processor();
System.out.println("Enter the type of processor in desktop "+(i+1));
        
     System.out.println("   Enter the type of processor in desktop "+(i+1));
     p.setType(sc.nextLine());   
     System.out.println("Enter the frequency of the processor present in the desktop "+(i+1));
   p.setFrequency(Double.parseDouble(sc.nextLine()));  
ds.setProcessor(p);
list.add(ds);
}
System.out.println("The details of all desktops are");
DesktopPCBO d= new DesktopPCBO();
   d.printAllDesktopPCDetails(list);

System.out.println("Enter the type of processor to be searched");
d.printDesktopPCDetailsWithProcessorType(list, sc.next());


System.out.println("Enter the processor frequency to be searched");
d.printDesktopPCDetailsWithProcessorFrequency(list, sc.nextDouble());



}
}
