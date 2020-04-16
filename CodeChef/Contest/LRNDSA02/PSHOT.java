import java.io.*;
import java.util.*;
class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    String shots = sc.next();
		    boolean matchEnded = false;
		    int aWin=0,bWin=0,aLost=0,bLost=0;
		    for(int i=0;i<2*n;i++) {
		        if(shots.charAt(i) == '1') {
		            if(i % 2 == 0) aWin++;
		            else bWin++;
		        }else {
		            if(i % 2 == 0) aLost++;
		            else bLost++;
		        }
		        if(aWin + bLost > n || bWin + aLost >n) {
		            System.out.println(i+1);
		            matchEnded = true;
		            break;
		        }
		    }
		    if(!matchEnded) {
		        System.out.println(2*n);
		    }
		}
	}
}
