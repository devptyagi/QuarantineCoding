// { Driver Code Starts

import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    
    static Stack<Integer> trackStack = new Stack<>();
    
	public void push(int a,Stack<Integer> s) {
	    if(s.isEmpty()) {
            s.push(a);
            trackStack.push(a);
            return;
        }
        s.push(a);
        if(a < trackStack.peek()) {
            trackStack.push(a);
        }else {
            trackStack.push(trackStack.peek());
        }
	}
	
	public int pop(Stack<Integer> s) {
	    if(s.isEmpty()){
            return -1;
        }
        int ans = s.pop();
        trackStack.pop();
        return ans;
	}
	
	public int min(Stack<Integer> s) {
       return trackStack.peek();
	}
	
	public boolean isFull(Stack<Integer>s, int n) {
	    return s.size() == n;
	}
	
	public boolean isEmpty(Stack<Integer>s) {
       return s.isEmpty();
	}
}
