import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- != 0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for(int i=0;i<s1.length();i++)
            {
                arr1[s1.charAt(i)-'a'] = 1;
            }
            for(int i=0;i<s2.length();i++)
            {
                arr2[s2.charAt(i)-'a'] = 1;
            }
            for(int i=0;i<26;i++)
            {
                if(arr1[i] == 1 && arr2[i] == 1)
                {
                    arr1[i] = arr2[i] = 0;
                }
            }
            for(int i=0;i<26;i++)
            {
                if(arr1[i] != 0 || arr2[i] != 0)
                {
                    System.out.print((char)(i+'a'));
                }
            }
            System.out.println();
        }
	}
}
