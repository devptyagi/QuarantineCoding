import java.util.*;

public class ParanthesisChecker {

	static void paranthesisCheck(String s) {
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
                  stack.push(s.charAt(i));
            } else if(s.charAt(i) == ']'){
                topChar = stack.peek();
                if(topChar == '[')
                    stack.pop();
                else
                  stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')'){
                topChar = stack.peek();
                if(topChar == '(')
                    stack.pop();
                else
                  stack.push(s.charAt(i));
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        
        if(stack.isEmpty()) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    String s = sc.next();
		    paranthesisCheck(s);
		}
		sc.close();
	}

}
