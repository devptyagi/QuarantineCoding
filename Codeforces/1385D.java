import java.util.*;
import java.io.*;

public class D {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int t = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		while(t-- != 0) {
			int n = sc.nextInt();
			char[] s = sc.next().toCharArray();
			ans.append(aGoodString(0, n - 1, 'a', s) + "\n");
		}
		out.println(ans);
		out.close();
	}
	
	static int aGoodString(int l, int r, char c, char[] s) {
		if(l == r) {
			if(s[l] == c) return 0;
			else return 1;
		}
		int mid = (l + r) / 2;
		return Math.min(getCost(l, mid, c, s) + aGoodString(mid + 1, r, (char)(c+1), s), getCost(mid+1, r, c, s) + aGoodString(l, mid, (char)(c+1), s));
	}
	
	static int getCost(int l, int r, char c, char[] s) {
		int count = 0;
		for(int i=l;i<=r;i++) {
			if(s[i] != c) count++;
		}
		return count;
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
