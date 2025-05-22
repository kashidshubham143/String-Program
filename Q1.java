/*
Without using any loop constructs, reverse a string using StringBuilder or StringBuffer.
 */
 import java.util.*;
 class Q1
 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String =");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println("Result="+sb.toString());
	}
 }