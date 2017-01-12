
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/dd/MM hh:mm:ss G W w  D  F  EEEE  S z");
		String strdate=sdf.format(d);
		System.out.println(strdate);
		
		/*
		String s="100/100/2016";
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		try {
			sdf1.setLenient(false);
			Date d1=sdf1.parse(s);
			
			System.out.println(d1);
			System.out.println(1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(-1);
		}
		
		
		
		
		
		*/
		
		
		
		
		
		
		
	}

}
