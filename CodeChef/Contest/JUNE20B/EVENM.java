import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		while (t-- != 0) {
		   int n = sc.nextInt();
		   int[][] a = new int[n][n];
		   int count = 1;
		   for(int i=0;i<n;i++) {
		       if(i % 2 == 0) {
		           for(int j=0;j<n;j++) {
		               a[i][j] = count;
		               count++;
		           }
		       } else {
		           for(int j=n-1;j>=0;j--) {
		               a[i][j] = count;
		               count++;
		           }
		       }
		   }
		   for(int i=0;i<n;i++) {
		       for(int j=0;j<n;j++) {
		           out.write(a[i][j]+" ");
		       }
		       out.write("\n");
		   }
		   out.flush();
		}
	}
}
