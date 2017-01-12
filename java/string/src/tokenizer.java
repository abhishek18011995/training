import java.util.StringTokenizer;


public class tokenizer {

	
	public static void main(String[] args) {
		String s="room no_flat no_city_ address";
		
StringTokenizer st=new StringTokenizer(s,"_");
String s1=st.nextToken();
String s2=st.nextToken();
String s3=st.nextToken();
System.out.println(s3);
	}

}
