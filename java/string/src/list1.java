import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class list1 {
	
	public static void main(String[] args) {
		int i,n;
		Scanner n1=new Scanner(System.in);
		System.out.println("enter the no.");
		n=n1.nextInt();
		List list=new ArrayList();
		System.out.println("enter the string");
		for(i=0;i<n;i++)
		{
			String s1=n1.next();
			list.add(s1);
		}
		System.out.println(list);
		
		Iterator<String> iter=list.iterator();
		while (iter.hasNext()) {
			String s2 = iter.next();
			if(s2.charAt(0)!='a'){
				iter.remove();
				
			}	
		}
		System.out.println(list);
		
	}

}
