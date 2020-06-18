import java.io.*;
import java.util.*;
 
public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long n = sc.nextLong();
		    long count = 0;
		    while(a <= n && b <=n) {
		        if(a > b) {
		            b += a;
		        }else {
		            a += b;
		        }
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
