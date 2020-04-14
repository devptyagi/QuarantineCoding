/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		    long n = sc.nextLong();
		    System.out.println(coins(n));
		}
	}
	
	static long coins(long n) {
	    if(n < 12) return n;
	    return coins(n / 2) + coins(n / 3) + coins(n / 4);
	}
}
