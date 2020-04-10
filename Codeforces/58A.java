import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String hello = "hello";
		String input = sc.next();
		int j = 0;
		int check = 0;
		for(int i=0;i<input.length();i++)
		{
		    if(input.charAt(i) == hello.charAt(j))
		    {
		        j++;
		        check++;
		    }
		    if(check == 5) break;
		}
		if(check == 5){
		    System.out.println("YES");
		}else {
		    System.out.println("NO");
		}
	}
}
