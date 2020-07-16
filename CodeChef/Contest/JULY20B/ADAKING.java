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
			int k = sc.nextInt();
			char[][] board = new char[8][8];
			board[0][0] = 'O';
			k--;
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(i == 0 && j == 0) {
						continue;
					}
					if(k > 0) {
						board[i][j] = '.';
						k--;
					} else {
						board[i][j] = 'X';
					}
				}
			}
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					ans.append(board[i][j]);
				}
				ans.append("\n");
			}
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
