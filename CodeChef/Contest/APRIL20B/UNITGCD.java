import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    try{
    		Scanner sc = new Scanner(System.in);
    		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    		int t = sc.nextInt();
    		
    		while(t-- != 0)
    		{
    		    int n = sc.nextInt();
    		    if(n <= 4)
    		    {
    		        out.write("1\n");
    		        out.write(n+" ");
    		        for(int i=0;i<n;i++)
    		            out.write(i+1+" ");
    		    }
    		    else
    		    {
    		        int k = 4;
    		        out.write(n/2+"\n");
    		        out.write("3 1 2 3\n");
    		        while(k < n)
    		        {
    		            if(n - k >= 1)
    		            {
    		                out.write(2+" "+k+" "+(k+1)+"\n");
    		                k += 2;
    		            }
    		        }
    		        if(n % 2 == 0)
    		        {
    		            out.write(1+" "+n+"\n");
    		        }
    		    }
    		    out.flush();
    		}
	    }catch(Exception e){
	        
	    }
	}
}
