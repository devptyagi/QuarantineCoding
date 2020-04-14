import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
    		Scanner sc = new Scanner(System.in);
    		int t = sc.nextInt();
    		
    		while(t-- != 0)
    		{
    		    int n = sc.nextInt();
    		    sc.nextLine();
    		    String s = sc.nextLine();
    		    if(s.contains("1 0 1") || s.contains("1 0 0 1") || s.contains("1 0 0 0 1") || s.contains("1 0 0 0 0 1") || s.contains("1 1"))
    		    {
    		        System.out.println("NO");
    		    }
    		    else
    		    {
    		        System.out.println("YES");
    		    }
    		}
	    }
	    catch(Exception e){
	        
	    }
	}
}
