import java.io.*;
import java.util.*;
 
public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long n = sc.nextLong();
		long w = sc.nextLong();
		long cost = 0;
		for(long i=1;i<=w;i++) {
		    cost += i * k;
		}
		if(cost <= n) {
		    System.out.println(0);
		}else {
		    System.out.println(cost - n);
		}
	}
}
