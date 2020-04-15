/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static long C(long n, long r) {
        long res = 1;
        if(r > n/2){
            r = n - r;
        }
        for(long i=0;i<r;i++) {
            res *=  n;
            res /= i+1;
            n--;
        }
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- != 0) {
	        long n = sc.nextLong();
	        long k = sc.nextLong();
	        System.out.println(C(n-1,n-k));
        }
		
	}
}
