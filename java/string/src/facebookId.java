import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class facebookId {

	
	public static void main(String[] args) {
		HashMap<String,String> map =new HashMap<String,String>();
		HashMap<String,String> map1 =new HashMap<String,String>();
		map.put("anmoltaran@gmail.com","1*2*3*4");
		map.put("tiger1885@gmail.com","type123");
		map.put("abhis@gmail.com","Abhi!");
		map.put("avinashbailore@gmail.com","avinash123");
		map.put("ravi12@gmail.com","rvi678");
		
		System.out.println(map);
		
		Set<String> set=map.keySet();
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while (itr.hasNext()) {
			String s1=itr.next();
			int ind=s1.indexOf('@');
			String s2=s1.substring(0, ind);
			System.out.println(s2);
			String s3=map.get(s1);
			map1.put(s2, s3);
		}
		System.out.println(map1);
		
		
		//System.out.println(s1+map.get(s1));
	}

}
