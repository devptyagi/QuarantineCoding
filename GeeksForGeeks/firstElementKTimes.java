import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- != 0)
		{
		    String line = br.readLine();
		    String[] strs = line.trim().split("\\s+");
		    int n = Integer.parseInt(strs[0]);
		    int k = Integer.parseInt(strs[1]);
		    int[] a = new int[n];
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    line = br.readLine();
		    strs = line.trim().split("\\s+");
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(map.get(a[i]) == null)
		        {
		            map.put(a[i], 1);
		        }
		        else
		        {
		            map.put(a[i], map.get(a[i]) + 1);
		        }
		    }
		    boolean found = false;
		    for(int i=0;i<n;i++)
		    {
		        if(map.get(a[i]) == k)
		        {
		            System.out.println(a[i]);
		            found = true;
		            break;
		        }
		    }
		    if(!found)
		    {
		        System.out.println(-1);
		    }
		}
	}
}
