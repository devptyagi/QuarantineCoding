import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int t = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		while(t-- != 0) {
			int n = sc.nextInt();
			int chef = 0, morty = 0;
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				long pA = power(a);
				long pB = power(b);
				if(pA > pB) {
					chef++;
				} else if(pB > pA) {
					morty++;
				} else {
					chef++;
					morty++;
				}
			}
			if(chef > morty) {
				ans.append("0 " + chef + "\n" );
			} else if(morty > chef) {
				ans.append("1 " + morty + "\n");
			} else {
				ans.append("2 " + chef + "\n");
			}
		}
		out.print(ans.toString());
		out.close();
	}
	
	static long power(int n) {
		long sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		} 
		return sum;
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
