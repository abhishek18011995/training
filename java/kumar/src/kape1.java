import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
 
public class kape1 {
    public static void main(String args[]){
    	int j=1;
       Scanner sc = new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
      HashMap<Integer,Integer>h1=new HashMap<Integer,Integer>();
      for(int i=0;i<=n;i++)
      {
                  h1.put(sc.nextInt(),sc.nextInt());
                  }
     //  System.out.println(UserMainCode.getvalues(h1));
       ArrayList<Integer>a1=new ArrayList<Integer>();
       int m=0;
       Iterator<Integer> it=h1.keySet().iterator();
      /* while(j<n)
       {
    	   a1.add(h1.get(j));
    	   j++;
    	   
       }*/
       while(it.hasNext())
       {
                       int x=it.next();
                       System.out.println(x);
                       a1.add(h1.get(x));
                       
                       
       }  
       h1.remove(2);
      
       System.out.println(a1);
       Collections.sort(a1);
       m=a1.get(0)+a1.get(1)+a1.get(2);
       System.out.println(m);
       System.out.println(h1);
    }
}

 /*
public class UserMainCode {
                public static int getvalues(HashMap<Integer,Integer>h1)
                {
                               
                                }}*/
 
