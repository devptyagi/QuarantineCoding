import java.util.*;
import java.io.*;

class CodeChef {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int t = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		while(t-- != 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = sc.readArray(n);
			sort(a);
			int count = 1;
			int temp = a[0];
			int i = 1;
			while(i < n) {
				if(temp <= x) {
					count += n - i;
					break;
				} else {
					temp = (temp + 1) / 2;
					if(temp <= a[i]) {
						count++;
						temp = a[i];
						i++;
					} else {
						count++;
					}
				}
			}
			temp = a[n - 1];
			if(temp > x) {
				while(temp > x) {
					temp = (temp + 1) / 2;
					count++;
				}
			}
			ans.append(count+"\n");
		}
		out.print(ans.toString());
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i : a) l.add(i);
		Collections.sort(l, Collections.reverseOrder());
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
