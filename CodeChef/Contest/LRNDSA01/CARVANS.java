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
		        int n = sc.nextInt();
		        int[] speeds = new int[n];
		        for(int i=0;i<n;i++)
		        {
		            speeds[i] = sc.nextInt();
		        }
		        int carsRunningAtMaxSpeed = 1;
		        int currentMaxAllowedSpeed = speeds[0];
		        for(int i=1;i<n;i++)
		        {
		            if(speeds[i] <= currentMaxAllowedSpeed)
		            {
		                carsRunningAtMaxSpeed++;
		                currentMaxAllowedSpeed = speeds[i];
		            }
		        }
		        System.out.println(carsRunningAtMaxSpeed);
		    }
		}catch(Exception e) {
		    
		}
	}
}
