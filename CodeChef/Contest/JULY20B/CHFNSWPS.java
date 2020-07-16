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
			int[] a = sc.readArray(n);
			int[] b = sc.readArray(n);
			int minOverall = Integer.MAX_VALUE;
			HashMap<Integer, Integer> frequency = new HashMap<>();
			HashMap<Integer, Integer> map = new HashMap<>();
			HashMap<Integer, Integer> count = new HashMap<>();
			ArrayList<Integer> swapA = new ArrayList<>(), swapB = new ArrayList<>();
			for(int i : a) {
				minOverall = Math.min(minOverall, i);
				if(frequency.get(i) == null) frequency.put(i, 1);
				else frequency.put(i, frequency.get(i) + 1);
			}
			for(int i : b) {
				minOverall = Math.min(minOverall, i);
				if(frequency.get(i) == null) frequency.put(i, 1);
				else frequency.put(i, frequency.get(i) + 1);
			}
			boolean isPossible = true;
			for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
				if(entry.getValue() % 2 != 0) {
					isPossible = false;
					break;
				} else {
					map.put(entry.getKey(), entry.getValue() / 2);
				}
			}
			if(!isPossible) {
				ans.append("-1\n");
				continue;
			}
			count.putAll(map);
			for(int i : a) {
				if(map.get(i) != null && map.get(i) != 0) {
					map.put(i, map.get(i) - 1);
				} else {
					swapA.add(i);
				}
			}
			for(int i : b) {
				if(count.get(i) != null && count.get(i) != 0) {
					count.put(i, count.get(i) - 1);
				} else {
					swapB.add(i);
				}
			}
			if(swapA.size() == 0) {
				ans.append("0\n");
				continue;
			}
			Collections.sort(swapA);
			Collections.sort(swapB, Collections.reverseOrder());
			long res = 0;
			for(int i=0;i<swapA.size();i++) {
				res += Math.min(2 * minOverall, Math.min(swapA.get(i), swapB.get(i)));
			}
			ans.append(res+"\n");
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
