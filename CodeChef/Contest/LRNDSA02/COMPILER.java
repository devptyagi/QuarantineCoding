import java.io.*;
import java.util.*;
class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    String s = sc.next();
		    int count = 0;
		    Stack<Character> stack = new Stack<>();
		    for(int i=0;i<s.length();i++) {
		        if(s.charAt(i) == '<') {
		            stack.push(s.charAt(i));
		        }else {
		            if(!stack.isEmpty()) {
		                stack.pop();
		                if(stack.isEmpty()) count = i+1;
		            }else {
		                break;
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}
