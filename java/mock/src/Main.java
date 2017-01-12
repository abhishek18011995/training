import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,String> map1=new HashMap<String, String>();
		Map<String,String> map2=new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			
			String key=sc.nextLine();
			String val1=sc.nextLine();
			String val2=sc.nextLine();
			
			
			map1.put(key, val1);
			map2.put(key, val2);
			
			
		}
		
		
		
		
Map<String,String> m3=	UserMainCode.concatmapvalues(map1, map2);
	System.out.println(m3);
		
	}
}
