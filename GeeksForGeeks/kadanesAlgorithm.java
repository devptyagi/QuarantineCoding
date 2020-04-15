/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-- != 0) {
	        int n = Integer.parseInt(br.readLine());
	        int[] a = new int[n];
	        String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
	        for(int i=0;i<n;i++) {
	            a[i] = Integer.parseInt(strs[i]);
	        }
	        int maxSoFar = Integer.MIN_VALUE;
	        int maxEndingHere = 0;
	        for(int i=0;i<n;i++) {
	            maxEndingHere += a[i];
                if(maxSoFar < maxEndingHere)
                    maxSoFar = maxEndingHere;
                if(maxEndingHere < 0)
	                maxEndingHere = 0;
	        }
	        
	        System.out.println(maxSoFar);
	    }
	}
}
