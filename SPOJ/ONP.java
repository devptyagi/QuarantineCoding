import java.util.*;
import java.io.*;
 
class Solution {
	
	static int prec(char c) {
		if(c == '-' || c == '+') {
			return 1;
		} else if(c == '*' || c == '/') {
			return 2;
		} else if(c == '^'){
			return 3;
		} else {
			return -1;
		}
	}
 
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int t = sc.nextInt();
		while(t-- != 0) {
			char[] s = sc.next().toCharArray();
			ArrayDeque<Character> stack = new ArrayDeque<>();
			String ans = new String("");
			for(char c : s) {
				if(Character.isLetterOrDigit(c)) {
					ans += c;
				}
				else if(c == '(') {
					stack.push(c);
				}
				else if(c == ')') {
					while(!stack.isEmpty() && stack.peek() != '(') {
						ans += stack.pop();
					}
					if(!stack.isEmpty()) stack.pop();
				}
				else {
					while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
						ans += stack.pop();
					}
					stack.push(c);
				}
			}
			while(!stack.isEmpty()) {
				ans += stack.pop();
			}
			out.println(ans);
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
        
    }
} 
