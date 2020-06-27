import java.util.*;
import java.io.*;
 
class Solution {
 
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int[] a = new int[500];
			a[0] = 1;
			int len = 1;
			int count = 0;
			int i = 2;
			int num = 0;
			while(i <= n) {
				count = 0;
				num = 0;
				while(count < len) {
					a[count] = a[count] * i;
					a[count] = a[count] + num;
					num = a[count] / 10;
					a[count] = a[count] % 10;
					count++;
				}
				while(num != 0) {
					a[len] = num % 10;
					num = num / 10;
					len++;
				}
				i++;
			}
			len--;
			while(len >= 0) {
				out.print(a[len]);
				len--;
			}
			out.println();
		}
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
        
    }
 
} 
