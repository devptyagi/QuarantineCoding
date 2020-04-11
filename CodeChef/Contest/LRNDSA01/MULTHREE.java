import java.io.*;
import java.util.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    long k = sc.nextLong();
		    int d0 = sc.nextInt();
		    int d1 = sc.nextInt();
		    long sum1 = (2 * (d0 + d1)) % 10;
		    long sum2 = sum1 + (4 * (d0 + d1)) % 10;
		    long sum3 = sum2 + (8 * (d0 + d1)) % 10;
		    long sum4 = sum3 + (6 * (d0 + d1)) % 10;
		    
		    long sum = (d0 + d1 + (d0 + d1) % 10) % 3;
		    if((k - 3) % 4 == 0) sum += (((k - 3) / 4)*(sum4)) % 3;
            if((k - 3) % 4 == 1) sum += (((k - 3) / 4)*(sum4) + sum1) %3;
            if((k - 3) % 4 == 2) sum += (((k - 3) / 4)*(sum4) + sum2) %3;
            if((k - 3) % 4 == 3) sum += (((k - 3) / 4)*(sum4) + sum3) % 3;
            
            if(sum % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
	    }
	}
}
