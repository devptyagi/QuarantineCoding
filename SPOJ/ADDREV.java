import java.util.*;
import java.io.*;
 
class Solution {
	
	static int reverse(int n) {
		int ans = 0;
		while(n > 0) {
			if(ans == 0 && n % 10 == 0) {
				n /= 10;
				continue;
			}
			ans *= 10;
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}
 
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream =System.out;
                PrintWriter out =new PrintWriter(outputStream);
		int t = sc.nextInt();
		while(t-- != 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = reverse(a) + reverse(b);
			ans = reverse(ans);
			out.println(ans);
		}
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
