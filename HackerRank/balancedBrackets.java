import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static boolean paranthesisCheck(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            char topChar;
            if(s.charAt(i) == '}') {
                topChar = stack.peek();
                if(topChar == '{')
                    stack.pop();
                else
                    return false;
            } else if(s.charAt(i) == ']'){
                topChar = stack.peek();
                if(topChar == '[')
                    stack.pop();
                else
                    return false;
            } else if(s.charAt(i) == ')'){
                topChar = stack.peek();
                if(topChar == '(')
                    stack.pop();
                else
                    return false;
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            String s = sc.next();
            if(paranthesisCheck(s)) {
            System.out.println("YES");
            } else {
            System.out.println("NO");
            }
        }
        sc.close();
    }
}
