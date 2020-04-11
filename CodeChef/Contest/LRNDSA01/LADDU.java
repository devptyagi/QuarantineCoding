import java.io.*;
import java.util.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int activities = sc.nextInt();
		    String origin = sc.next();
		    int laddus = 0;
		    for(int i=0;i<activities;i++) {
		        String act = sc.next();
		        switch(act) {
		            case "CONTEST_WON" :
		                laddus += 300;
		                int rank = sc.nextInt();
		                if(rank < 20) laddus += (20 - rank);
		                break;
		            case "TOP_CONTRIBUTOR" :
		                laddus += 300;
		                break;
	                case "BUG_FOUND" :
	                    laddus += sc.nextInt();
	                    break;
                    case "CONTEST_HOSTED" :
                        laddus += 50;
                        break;
		        }
		    }
		    int count = 0;
		    if(origin.equals("INDIAN")) {
		        while(laddus >= 200) {
		            count++;
		            laddus -= 200;
		        }
		    }else if(origin.equals("NON_INDIAN")) {
		        while(laddus >= 400) {
		            count++;
		            laddus -= 400;
		        }
	        }
	        System.out.println(count);
	    }
	}
}
