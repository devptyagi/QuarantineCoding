import java.io.*;
import java.util.*;
class Solution {
    
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    
	public static void main (String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-- != 0) {
		    long n = sc.nextLong();
		    int q = sc.nextInt();
		    long currentFloor = 0;
		    long count = 0;
		    for(int i=0;i<q;i++) {
		        long fi = sc.nextLong();
		        long di = sc.nextLong();
		        count += Math.abs(fi-currentFloor);
	            	currentFloor = fi;
		        count += Math.abs(di-fi);
		        currentFloor = di;
		    }
		    System.out.println(count);
		}
	}
}
