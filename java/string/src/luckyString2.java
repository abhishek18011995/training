import java.util.Scanner;

import org.w3c.dom.ranges.Range;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;


public class luckyString2 {

	
	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string");
		Scanner scanner=new Scanner(System.in);
			s=scanner.nextLine();
			System.out.println(s);
		int f=s.charAt(0);
			int len=s.length();
		int l=s.charAt(len-1);
			if(f>=97 && f<=105 && l>=119 && l<=122)
			{
				System.out.println("lucky string");
			}
			else
			{
				System.out.println("lucky lucky string");
			}

	}

}
