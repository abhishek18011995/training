

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalDemo {
	
	public static void main(String[] args) throws ParseException {
		
		
		String st="12/12/2016";
		String st2="1/1/1990";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		sdf.setLenient(false);
		Date dob=sdf.parse(st2);
		Date dod=sdf.parse(st);
		
		
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(dob);
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(dod);
		
	long l1=	cal.getTimeInMillis();
		System.out.println(l1);
		
long l2=	cal2.getTimeInMillis();
		System.out.println(l2);
		
		long k=l1+l2;
		Calendar cal3=Calendar.getInstance();
		cal3.setTimeInMillis(k);
		System.out.println("cal3::"+cal3);
		System.out.println(cal3.get(Calendar.YEAR));
		System.out.print("::"+cal3.get(Calendar.MONTH));
		System.out.print("::"+cal3.get(Calendar.DAY_OF_MONTH));
			
		
		
		
		
		
		
		long l=l2-l1;
		
		
		
		
		float mmm= Math.abs(l);
		float ss= mmm/1000.0f;
		float m2=ss/60.0f;
	float hours=	m2/60.0f;
	float days=	hours/24.0f;
	 float years=  days/365.0f;
	 System.out.println(years);
	
	
		System.out.println(mmm+"Milli sec");
		
		
		
		int yy=cal.get(Calendar.YEAR);
		int mm=cal.get(Calendar.MONTH);
		int dd=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(yy+":"+mm+":"+dd);
		cal.set(Calendar.DAY_OF_MONTH,cal.get(Calendar.DAY_OF_MONTH)+ 10);
		cal.set(Calendar.MONTH,cal.get(Calendar.MONTH)+2 );
		cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY)+15);
		
		int yy1=cal.get(Calendar.YEAR);
		int mm1=cal.get(Calendar.MONTH);
		int dd1=cal.get(Calendar.DAY_OF_MONTH);
	System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		
		
		System.out.println(yy1+":"+mm1+":"+dd1);
		
	}

}
