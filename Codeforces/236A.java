import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] c = new int[26];
		for(int i=0;i<s.length();i++)
		{
		    c[s.charAt(i)-'a']++;
		}
		int distinct = 0;
		for(int i=0;i<26;i++)
		{
		    if(c[i] != 0)
		    {
		        distinct++;
		    }
		}
		if(distinct % 2 == 0)
		{
		    System.out.println("CHAT WITH HER!");
		}
		else
		{
		    System.out.println("IGNORE HIM!");
		}
	}
}
