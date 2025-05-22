/*
Write a program that finds the longest palindromic prefix in a given string using StringBuilder. 
 Input: "levelheaded" → Output: "level"
 */
 import java.util.*;
 class PalindromicString
 {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String longestPrefix = "";

        for (int i = s.length(); i >= 1; i--) 
		{
            String prefix = s.substring(0, i);
            StringBuilder sb = new StringBuilder(prefix);
            if (prefix.equals(sb.reverse().toString())) 
			{
                longestPrefix = prefix;
                break;
            }
        }

        System.out.println("Result = " + longestPrefix);
	}
 }