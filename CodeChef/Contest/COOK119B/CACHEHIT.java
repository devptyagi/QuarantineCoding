/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    int b = sc.nextInt();
		    int m = sc.nextInt();
		    int[] a = new int[m];
		    for(int i=0;i<m;i++) {
		        a[i] = sc.nextInt();
		    }
		    int count = 1;
		    int current = -1;
		    for(int i=0;i<m;i++) {
		        int x = a[i];
		        if(current == -1) {
		            current = x/b; 
		            continue;
		        }
		        if(x/b != current) {
		            count++;
		            current = x/b;
		        }
		    }
		    System.out.println(count);
		}
	}
}
