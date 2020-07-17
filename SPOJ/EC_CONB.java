import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		StringBuilder ans = new StringBuilder();
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			if(n % 2 == 0) {
				int temp = 0;
				while(n != 0) {
					temp = temp << 1;
					temp += (n & 1);
					n >>= 1;
				}
				ans.append(temp+"\n");
			} else {
				ans.append(n+"\n");
			}
		}
		out.println(ans.toString());
		out.close();
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
