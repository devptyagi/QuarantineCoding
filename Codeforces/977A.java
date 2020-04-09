import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = sc.nextInt();
		for(int i=0;i<count;i++)
		{
		    if(n%10 == 0) 
		    {
		        n /= 10;
		        continue;
		    }
		    n--;
		}
		System.out.println(n);
		
	}
}
