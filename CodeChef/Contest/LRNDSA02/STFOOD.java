import java.io.*;
import java.util.*;
class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    int maxProfit = 0;
		    for(int i=0;i<n;i++) {
		        int s = sc.nextInt();
		        int p = sc.nextInt();
		        int v = sc.nextInt();
		        int profit = (p / (s + 1)) * v;
		        if(profit > maxProfit) maxProfit = profit;
		    }
		    System.out.println(maxProfit);
		}
	}
}
