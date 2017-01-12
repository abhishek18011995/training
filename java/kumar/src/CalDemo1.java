import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalDemo1 {

	
	public static void main(String[] args) throws ParseException {
		
		String s1="18/01/1995";
		String s2="18/08/2016";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		
		sdf.setLenient(false);
		Date dob=sdf.parse(s1);
		Date cd=sdf.parse(s2);
		System.out.println(dob);
		System.out.println(cd);
		
		Calendar cal=Calendar.getInstance();
		Calendar cal1=Calendar.getInstance();
		cal.setTime(dob);
		cal1.setTime(cd);
		
		System.out.println(cal);
		System.out.println(cal1);
		
		long l1=cal.getTimeInMillis();
		long l2=cal1.getTimeInMillis();
		long l=l2-l1;
		System.out.println(l);
		double ss=l/1000;
		double h=ss/3600;
		double day=h/24;
		double years=day/365;
		System.out.println(years);
		int yy=cal.get(Calendar.YEAR);
		int MM=cal.get(Calendar.MONTH);
		int dd=cal.get(Calendar.DATE);
		System.out.println(dd+"/"+MM+"/"+yy);
		
		
	}

}
