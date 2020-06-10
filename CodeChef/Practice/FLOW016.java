/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    System.out.println(gcd(a, b) + " " + lcm(a, b));
		}
	}
}
