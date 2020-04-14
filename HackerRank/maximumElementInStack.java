import java.io.*;
import java.util.*;

public class Solution {

    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> trackStack = new Stack<>();

    static void pushElement(int x) {
        if(mainStack.isEmpty()) {
            mainStack.push(x);
            trackStack.push(x);
            return;
        }
        mainStack.push(x);
        if(x > trackStack.peek()) {
            trackStack.push(x);
        }else {
            trackStack.push(trackStack.peek());
        }
    }

    static void deleteElement() {
        if(mainStack.isEmpty()){
            return;
        }
        mainStack.pop();
        trackStack.pop();
    }

    static int getMax() {
        return trackStack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- != 0) {
            int q = sc.nextInt();
            if(q == 1) {
                int x = sc.nextInt();
                pushElement(x);
            }else if(q == 2) {
                deleteElement();
            }else {
                System.out.println(getMax());
            }
        }
    }
}
