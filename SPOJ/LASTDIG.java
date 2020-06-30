import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    long a = sc.nextInt(), b = sc.nextInt();
		    long p = a % 10, q = b % 4;
		    if(b == 0) System.out.println(1);
		    else if(p == 0 || p == 1 || p == 5 || p == 6) System.out.println(p);
		    else if(q == 1) System.out.println(p % 10);
		    else if(q == 2) System.out.println((p * p) % 10);
		    else if(q == 3) System.out.println((p * p * p) % 10);
		    else if(q == 0) System.out.println((p * p * p * p) % 10);
		}
	}
}
