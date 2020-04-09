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
		    int n = sc.nextInt();
    		long[] budgets = new long[n];
    		for(int i=0;i<n;i++)
    		{
    		    budgets[i] = sc.nextLong();
    		}
    		Arrays.sort(budgets);
    		long maxProfit = Long.MIN_VALUE;
    		for(int i=0;i<n;i++)
    		{
    		    long x = budgets[i] * (n-i);
    		    if(x > maxProfit)
    		        maxProfit = x;
    		}
    		System.out.println(maxProfit);
		}catch(Exception e) {
		    return;
		}
	}
}
