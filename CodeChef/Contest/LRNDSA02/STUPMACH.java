import java.io.*;
import java.util.*;
class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++) {
		        a[i] = sc.nextInt();
		    }
		    Stack<Integer> s = new Stack<>();
		    long ans = 0;
		    for(int i=0;i<n;i++) {
		        if(s.isEmpty()) {
		            s.push(a[i]);
		            ans += a[i];
		        }else {
		            if(a[i] > s.peek()) {
		                ans += s.peek();
		            }else {
		                s.push(a[i]);
    		            ans += a[i];
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}
