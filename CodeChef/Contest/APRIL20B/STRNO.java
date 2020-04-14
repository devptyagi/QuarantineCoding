import java.io.*;
import java.util.*;

class Solution {
	public static void main (String[] args) {
	    try{
    		Scanner sc = new Scanner(System.in);
    		int t = sc.nextInt();
    		
    		while(t-- != 0)
    		{
    		    int n = sc.nextInt();
    		    int k = sc.nextInt();
    		    int count = 0;
    		    
    		    while(n % 2 == 0)
    		    {
    		        n /= 2;
    		        count++;
    		    }
    		    
    		    for(int i =3; i * i <= n; i++)
    		    {
    		        while(n % i == 0)
    		        {
    		            n /= i;
    		            count++;
    		        }
    		    }
    		    
    		    if(n > 2)
    		    {
    		        count++;
    		    }
    		    
    		    if(count < k)
    		        System.out.println(0);
    		    else
    		        System.out.println(1);
    		}
	    }catch(Exception e) {
	        return;
	    }
	}
}
