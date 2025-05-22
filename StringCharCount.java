/*
5. Compress a String Using Run-Length Encoding with StringBuilder

Problem:
Implement run-length encoding using StringBuilder. For example, the string "aaabbcddd" should be converted to "a3b2c1d3".
Example:
Input: "aaabbcddd"
Output: "a3b2c1d3"
*/
import java.util.*;
class StringCharCount
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string=");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(s.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(s.charAt(s.length() - 1)).append(count);
		System.out.println(sb.toString());
	}
}