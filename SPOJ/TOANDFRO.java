import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		StringBuilder ans = new StringBuilder();
		while(true) {
			int col = sc.nextInt();
			if(col == 0) break;
			String s = sc.next();
			int row = s.length() /  col;
			char[][] ch = new char[row][col];
			int k = 0;
			for(int i=0;i<row;i++) {
				if(i % 2 == 0) {
					for(int j=0;j<col;j++) {
						ch[i][j] = s.charAt(k);
						k++;
					}
				} else {
					for(int j=col-1;j>=0;j--) {
						ch[i][j] = s.charAt(k);
						k++;
					}
				}
			}		
			for(int j=0;j<col;j++) {
				for(int i=0;i<row;i++) {
					ans.append(ch[i][j]);
				}
			}
			ans.append("\n");
		}
		out.print(ans.toString());
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
