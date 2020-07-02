import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int n = sc.nextInt();
		int[] a = sc.readArray(n);
		int open = 0, len = 0, maxLen = 0, lenIndex = 0, depthIndex = 0, maxLenIndex = 0, depth = 0;
		for(int i=0;i<n;i++) {
			if(a[i] == 1) {
				if(open == 0) {
					lenIndex = i + 1;
				}
				open++;
			} else {
				if(open > depth) {
					depth = open;
					depthIndex = i;
				}
				open--;
				if(open == 0) {
					len = i + 2 - lenIndex;
					if(len > maxLen) {
						maxLen = len;
						maxLenIndex = lenIndex;
					}
				}
			}
		}
		out.println(depth + " " + depthIndex + " " + maxLen + " " + maxLenIndex);
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i : a) l.add(i);
		Collections.sort(l);
		for(int i=0; i<a.length; i++) a[i] = l.get(i);
	}
	
	static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        
        int[] readArray(int n) {
        	int[] a = new int[n];
        	for(int i=0; i<n; i++) {
        		a[i] = nextInt();
        	}
        	return a;
        }
        
    }

}
