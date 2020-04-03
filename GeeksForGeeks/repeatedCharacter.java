import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0)
		{
		    String s = sc.next();
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for(int i=0;i<s.length();i++)
		    {
		        if(map.get((int)s.charAt(i)) == null)
		        {
		            map.put((int)s.charAt(i), 1);
		        }
		        else 
		        {
		            map.put((int)s.charAt(i), map.get((int)s.charAt(i)) + 1);
		        }
		    }
		    boolean found = false;
		    for(int i=0;i<s.length();i++)
		    {
		        if(map.get((int)s.charAt(i)) > 1)
		        {
		            System.out.println(s.charAt(i));
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
