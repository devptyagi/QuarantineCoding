import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x = 1;
		
		while(t-- != 0)
		{
		    String s = sc.next();
		    StringBuilder ans = new StringBuilder();
		    int openBracket = 0;
		    for(int i=0;i<s.length();i++)
		    {
		        int digit = s.charAt(i) - '0';
		        

		        while (openBracket > digit) {
			    ans.append(')');
			    openBracket--;
			}
                
			while (openBracket < digit) {
			    ans.append('(');
			    openBracket++;
			}
                
                	ans.append(s.charAt(i));
                
		    }
		    
		    while (openBracket > 0) {
				ans.append(')');
				openBracket--;
           	}
	        System.out.println("Case #"+x+": "+ans.toString());
	        x++;
		}
	}
}
