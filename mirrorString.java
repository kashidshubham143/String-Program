/*
Create a mirror of a string around its center using StringBuilder. 
 Input: "race" → Output: "raceecar"
 */
 import java.util.*;
 class mirrorString
 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		StringBuilder ms=new StringBuilder(sb);
		ms.append(sb.reverse());
		System.out.println("Result="+ms.toString());
	}
 }