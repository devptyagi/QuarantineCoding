import java.io.*;
import java.util.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
    		int t = sc.nextInt();
    		while(t-- != 0) {
    		    int n = sc.nextInt();
    		    int count = 0;
    		    while(n != 0) {
    		        count += n / 5;
    		        n /= 5;
    		    }
    		    System.out.println(count);
    		}
		}catch(Exception e) {
		    return;
		}
	}
}
