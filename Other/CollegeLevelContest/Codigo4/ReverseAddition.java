import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- != 0) {
            String s = sc.nextLine();
            StringBuilder sNew = new StringBuilder();
            int sum = 0;
            for(int i=0;i<s.length();i++) {
                char a = s.charAt(i);
                char b = s.charAt(s.length()-i-1);
                int x = a + b - 96;
                if(x > 122) {
                    x = x % 122 + 96;
                }
                sNew.append((char)x);
            }
            System.out.println(sNew.toString());
        }
    }
}
