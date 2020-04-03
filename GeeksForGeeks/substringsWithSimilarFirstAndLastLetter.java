import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- != 0)
		{
		    int n = sc.nextInt();
		    String s = sc.next();
		    int[] c = new int[26];
		    for(int i=0;i<n;i++)
		    {
		        c[s.charAt(i)-'a']++;
		    }
		    int count = 0;
		    for(int i=0;i<26;i++)
		    {
		        count += (c[i] * (c[i] + 1)) / 2;
		    }
		    System.out.println(count);
		}
	}
}
