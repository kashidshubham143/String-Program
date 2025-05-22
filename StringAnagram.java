/*
Check if two strings are anagrams of each other using only StringBuilder methods (no arrays or HashMaps allowed).
*/
import java.util.*;
class StringAnagram
{
	public static void main(String x[])
	{
		Scanner xyz  = new Scanner(System.in);
	   System.out.println("Enter first string");
	   String first=xyz.nextLine();
	   System.out.println("Enter second string");
	   String second=xyz.nextLine();
	   
	   if(first.length()!=second.length())
	   { System.out.println("Not Anagram");
	   }
	   else
	   {
		    int f[]=new int[26];
			for(int i=0;i<first.length(); i++)
			{
				  f[first.charAt(i)-'a']++;
				  f[second.charAt(i)-'a']--;
			}
			boolean flag=true;
			for(int i=0;i<f.length; i++)
			{  if(f[i]!=0)
				{ flag=false;
			      break;
				}
			} 
			if(flag)
			{ System.out.println("String is  anagram");
			}
			else{
				 System.out.println("String not is anagram");
			}
		}
	}
}