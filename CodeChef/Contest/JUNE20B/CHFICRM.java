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
		   int n = sc.nextInt();
		   int[] currentMoney = new int[3];
		   boolean isPossible = true;
		   for(int i=0;i<n;i++) {
		       int incomingCoin = sc.nextInt();
		       switch(incomingCoin) {
		           case 5 :
		               currentMoney[0]++;
		               break;
	               case 10 :
	                   if(currentMoney[0] > 0) {
	                       currentMoney[0]--;
	                       currentMoney[1]++;
	                   }else {
	                       isPossible = false;
	                   }
	                   break;
                   case 15 :
                       if(currentMoney[1] > 0) {
	                       currentMoney[1]--;
	                       currentMoney[2]++;
	                   }else if(currentMoney[0] > 1){
	                       currentMoney[0] -= 2;
	                       currentMoney[2]++;
	                   } else {
	                       isPossible = false;
	                   }
                       break;
		       }
		   }
		   if(isPossible) {
		       System.out.println("YES");
		   }else {
		       System.out.println("NO");
		   }
		}
	}
}
