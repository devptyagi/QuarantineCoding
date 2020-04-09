/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		try {
		    int t = sc.nextInt();
		    while(t-- != 0)
		    {
    		    String s = sc.next();
    		    int m = s.length() / 2;
    		    int[] c = new int[26];
    		    for(int i=0;i<m;i++)
    		    {
    		        c[s.charAt(i)-'a']++;
    		    }
    		    int secondHalf = 0;
    		    if(s.length() % 2 == 0)
    		    {
    		        secondHalf = m;
    		    }
    		    else
    		    {
    		        secondHalf = m + 1;
    		    }
    		    for(int i=secondHalf;i<s.length();i++)
    		    {
    		        c[s.charAt(i)-'a']--;
    		    }
    		    boolean isLapin = true;
    		    for(int i : c)
    		    {
    		        if(i != 0){
    		            isLapin = false;
    		            break;
    		        }
    		    }
    		    if(isLapin)
    		        System.out.println("YES");
    		    else
    		        System.out.println("NO");
		    }
		} catch(Exception e) {
		    
		}
	}
}
