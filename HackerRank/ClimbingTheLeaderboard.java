import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int n = scores.length;
        int m = alice.length;
        int[] res = new int[m];

        int[] ranks = new int[n];
        ranks[0] = 1;

        for(int i=1;i<n;i++)
        {
            if(scores[i] < scores[i-1])
                ranks[i] = ranks[i-1] + 1;
            else if(scores[i] == scores[i-1])
                ranks[i] = ranks[i-1] ;
        }

        for(int i=0;i<m;i++)
        {
            int aliceScore = alice[i];
            if(aliceScore > scores[0]) {
                res[i] = 1;
            }else if(aliceScore < scores[n-1]) {
                res[i] = ranks[n-1] + 1;
            }else {
                int index = binarySearch(scores, aliceScore);
                res[i] = ranks[index];
            }
        }

        return res;

    }

    static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            if (arr[m] == x) 
                return m;
            else if(arr[m] < x && x < arr[m - 1])
                return m;
            else if(arr[m] > x && x >= arr[m + 1])
                return m + 1;
            else if(arr[m] < x)
                r = m - 1;
            else if(arr[m] > x)
                l = m + 1;
        }
        return -1; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++)
        {
            scores[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] alice = new int[m];
        for(int i=0;i<m;i++)
        {
            alice[i] = sc.nextInt();
        }

        int[] res = climbingLeaderboard(scores, alice);

        for(int i: res)
        {
            System.out.println(i);
        }


    }
}
