import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] a = new int[10];
		for(int i=0;i<s.length();i++) {
		    a[Character.getNumericValue(s.charAt(i))]++;
		}
		
		if(a[4] == 0 && a[7] == 0) {
		    System.out.println("-1");
		}else if(a[4] >= a[7]) {
		    System.out.println("4");
		}else if(a[4] < a[7]) {
		    System.out.println("7");
		}
	}
}
