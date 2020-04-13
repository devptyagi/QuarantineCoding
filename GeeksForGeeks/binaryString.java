import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void binarySubstring(String s, int n) {
        int oneCount = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') oneCount++;
        }
        int ans = oneCount * (oneCount - 1) / 2;
        System.out.println(ans);
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- != 0) {
		    int n = sc.nextInt();
		    String s = sc.next();
		    binarySubstring(s, n);
		}
	}
}
