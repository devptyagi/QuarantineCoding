import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- != 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long t = sc.nextLong();
            long currentPosition = 0;
            if(t % 2 == 0) {
                currentPosition += (t / 2) * a;
                currentPosition -= (t / 2) * b;
            } else {
                currentPosition += ((t + 1) / 2) * a;
                currentPosition -= (t / 2) * b;
            }
            System.out.println(currentPosition);
        }
    }
}
