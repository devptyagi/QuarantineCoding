/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++) {
		        a[i] = sc.nextInt();
		    }
		    int count = 0;
		    int mex = 1;
		    Set<Integer> hSet = new HashSet<>();
		    for(int i=0;i<n;i++) {
		        int x = a[i];
		        if(x == m) continue;
		        count++;
		        hSet.add(x);
		    }
		    while(hSet.contains(mex)) {
	            mex++;
	        }
		    if(mex == m) {
		        System.out.println(count);
		    }else {
		        System.out.println(-1);
		    }
		}
	}
}
