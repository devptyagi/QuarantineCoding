import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {4,7,47,74,44,444,447,474,477,777,774,744};
		int n = sc.nextInt();
		boolean isLucky = false;
		for(int i : a) {
		    if(n % i == 0) isLucky = true;
		}
		if(isLucky) {
		    System.out.println("YES");
		}else {
		    System.out.println("NO");
		}
	}
}
