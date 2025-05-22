/*
1. Reverse Words in a Sentence Using StringBuilder

Problem:
Given a sentence, reverse each word in the sentence while maintaining the original word order.
Example:
Input: "Java is powerful"
Output: "avaJ si lufrewop"
*/
import java.util.*;
class ReverseStringWords
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String s=sc.nextLine();
		String words[]=s.split(" ");
		System.out.println("Before Reverse word="+s);
		StringBuffer sb=new StringBuffer();
		for(String word:words)
		{
			for(int i=(word.length()-1);i>=0;i--)
			{
				sb.append(word.charAt(i));
			}
			sb.append(" ");
		}
		s=sb.toString();
		System.out.println("After Reverse word="+s);
	}
}