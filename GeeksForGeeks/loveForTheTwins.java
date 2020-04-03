import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- != 0)
		{
		    int n = sc.nextInt();
		    int[] a = new int[1001];
		    for(int i=0;i<n;i++)
		    {
		        a[sc.nextInt()]++;
		    }
		    int count = 0;
		    for(int i : a)
		    {
		        count += (i/2)*2;
		    }
		    System.out.println(count);
		}
	}
}
