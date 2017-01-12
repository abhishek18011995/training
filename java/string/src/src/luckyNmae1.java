package src;

import java.util.Scanner;

public class luckyNmae1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter the string");
		Scanner scanner=new Scanner(System.in);
			s=scanner.nextLine();
			System.out.println(s);
			char f=s.charAt(0);
			int len=s.length();
			char l=s.charAt(len-1);
			int mid=0;
			if (len%2!=0)
			{
				mid=len/2;
			}
			else
			{
				mid=(len/2)+1;
			}
			char m=s.charAt(mid);
			if(f=='a' && l=='n' && m=='i')
			{
				System.out.println("lucky string");
			}
			else 
			{
				System.out.println("lucky lucky string");
			}
	}

}
