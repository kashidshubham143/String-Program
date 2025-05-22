/*
Given a sentence, capitalize the first letter of each word using StringBuffer. 
*/
import java.util.*;
class Q2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String =");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++)
		{
			if(i==0|| sb.charAt(i-1)==' ')
			{
				sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
			}
		}
		
		System.out.println("Result="+sb.toString());
	}
}