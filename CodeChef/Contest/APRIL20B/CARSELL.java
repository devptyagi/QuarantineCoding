import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static final int mod = 1000000007;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
    		int t = sc.nextInt();
    		while(t-- != 0)
    		{
    		    int n = sc.nextInt();
    		    int[] cars = new int[n];
    		    for(int i=0;i<n;i++)
    		    {
    		        cars[i] = sc.nextInt();
    		    }
    		    Arrays.sort(cars);
    		    int yearCount = 0;
    		    int profit = 0;
    		    for(int i=n-1;i>=0;i--)
    		    {
    		        int x = cars[i] - yearCount++;
    		        profit += (x < 0) ? 0 : x % mod;
    		        profit %= mod;
    		    }
    		    System.out.println(profit);
    		}
		}catch(Exception e){
		    
		}
	}
}
