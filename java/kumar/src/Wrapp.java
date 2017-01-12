import javax.sound.sampled.BooleanControl;

public class Wrapp {
	
	public static void main(String[] args) {
		
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(false);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		Integer v1=new Integer(2112);
		Integer v2=new Integer(43222);
		System.out.println(v1.hashCode());
		System.out.println("The integer value is"+v1.intValue());
		System.out.println("the float value is"+v2.floatValue());
		int v=v1.compareTo(v2);
		if(v==0){
			System.out.println("Same");
			
		}if(v>0){
			System.out.println("v1 is greater");
			
		}if(v<0){
			System.out.println("v1 is lesser");
			
		}
		System.out.println(v1.MIN_VALUE);
		System.out.println(v1.MAX_VALUE);
		String s="1234";
	int y=	Integer.parseInt(s);
		y=y+100;
		System.out.println(y);
		
	}

}
