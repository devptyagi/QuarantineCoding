import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
		   String s = sc.next();
		   int n = s.length();
		   int ans = 0;
		   for(int i = 0; i < n-1 ; i++) {
		       if((s.charAt(i) == 'x' && s.charAt(i+1) == 'y') || (s.charAt(i) == 'y' && s.charAt(i+1) == 'x')) {
		           ans++;
		           i++;
		       }
		   }
		   System.out.println(ans);
		}
	}
}
