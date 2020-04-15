/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-- != 0) {
	        String line = br.readLine();
	        String[] strs = line.trim().split("\\s+");
	        int n = Integer.parseInt(strs[0]);
	        long s = Long.parseLong(strs[1]);
	        String line2 = br.readLine();
	        String[] array = line2.trim().split("\\s+");
	        long[] a = new long[n];
	        for(int k=0;k<n;k++) {
	            a[k] = Long.parseLong(array[k]);
	        }
	        boolean found = false;
	        int left = 0;
	        long currentSum = 0;
	        int right = 0;
	        for(int i = 0; i < n; i++) {
	            currentSum += a[i];
	            while(currentSum > s && left < i) {
	                currentSum -= a[left];
	                left++;
	            }
	            if(currentSum == s) {
	                right = i;
	                found = true;
	                break;
	            }
	        }
	        if(found)
	            System.out.println((left+1)+" "+(right+1));
            else
                System.out.println(-1);
	    }
	}
}
