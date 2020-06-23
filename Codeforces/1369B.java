import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    String s = sc.next();
		    StringBuilder ans = new StringBuilder();
		    int leftOne = -1;
		    int rightZero = -1;
		    for(int i=0;i<n;i++) {
		        if(s.charAt(i) == '1') {
		            leftOne = i;
		            break;
		        }
		        ans.append(s.charAt(i));
		    }
		    if(leftOne == -1) {
		        System.out.println(s);
		        continue;
		    }
		    for(int i=n-1;i>=0;i--) {
		        if(s.charAt(i) == '0') {
		            rightZero = i;
		            break;
		        }
		    }
		    if(rightZero == -1) {
		        System.out.println(s);
		        continue;
		    } else if(rightZero == leftOne - 1) {
		        rightZero++;
		    }
		    for(int i=rightZero;i<n;i++) {
		        ans.append(s.charAt(i));
		    }
		    System.out.println(ans.toString());
		}
	}
}
