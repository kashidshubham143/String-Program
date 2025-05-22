/*
4. Remove Duplicate Characters from String Using StringBuffer

Problem:
Write a program to remove duplicate characters from a string using StringBuffer.
Example:
Input: "programming"
Output: "progamin"
*/
import java.util.*;
class DuplicateElementRemove
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String =");
		String s=sc.nextLine();
		System.out.println("Before Duplicate="+s);
		StringBuffer sb=new StringBuffer();

		for(int i=0;i<s.length();i++)
		{char c=s.charAt(i);
			boolean b=false;
			for(int j=0;j<sb.length();j++)
			{
				if(sb.charAt(j)==c)
				{	b=true;
					break;
				}
			}
			if(!b)
			sb.append(c);
		}
		
		System.out.println("After Duplicate="+(sb.toString()));
	}
}