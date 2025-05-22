/*
Using only StringBuilder, determine if a string is made by repeating a substring. 
 Input: "abcabcabc" →
 Output: true (because "abc" is repeated)
 */
 import java.util.*;
 class StringRepeated
 {
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int len = s.length();

        boolean isRepeated = false;

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) 
			{ 
                String sub = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                int repeatCount = len / i;
                for (int j = 0; j < repeatCount; j++) 
				{
                    repeated.append(sub);
                }

                if (repeated.toString().equals(s)) {
                    isRepeated = true;
                    break;
                }
            }
        }

        System.out.println("Result = " + isRepeated);
	}
 }