import java.io.*;
import java.util.*;

public class Solution {
    
    static long pow(long a, long b) {
        long res = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                res = res * a;
            }
            a = a * a;
            b >>= 1;
        }
        return res;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = (6 * pow(4, n-2)) + ((n - 3) * (9 * pow(4, n-3)));
		System.out.println(ans);
	}
}
