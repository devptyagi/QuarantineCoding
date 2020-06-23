import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner();
        int t = sc.nextInt();
        while(t-- != 0) {
            long c = sc.nextLong();
            long n = sc.nextLong();
            long x = ((n) * (n + 1)) / 2;
            long ans = (x > c) ? c : ((c - x) % n);
            System.out.println(ans);
        }
    }
}
