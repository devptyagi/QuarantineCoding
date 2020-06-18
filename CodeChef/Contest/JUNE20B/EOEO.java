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
		   long ts = sc.nextLong();
		   if(ts % 2 == 1) {
		       System.out.println((ts - 1) / 2);
		   } else {
		       while(ts % 2 == 0) {
		           ts = ts / 2;
		       }
		       System.out.println((long)ts / 2);
		   }
		}
	}
}
