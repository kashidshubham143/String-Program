/*
Rotate a string to the right by k positions using StringBuffer. 
 Input: "abcdef", k = 2 → Output: "efabcd" 
 */
 import java.util.*;
 class RotateString 
 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		String s=sc.nextLine();
		System.out.println("Enter limit do u want to rotate=");
		int k=sc.nextInt();
		StringBuffer sb=new StringBuffer(s);
		 int len = sb.length();
		k=k%len;
		sb.reverse();
		 int start = 0, end = k - 1;
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
		
		 start = k;
        end = len - 1;
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
		System.out.println("Result="+sb.toString());
	}
 }