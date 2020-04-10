import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        while(n != 1) {
            System.out.print(n+" ");
            for(int i=2;i<=n;i++) {
                if(n % i == 0) {
                    n /= i;
                    break;
                }
            }
        }
        System.out.print(n+" ");
	}
}
