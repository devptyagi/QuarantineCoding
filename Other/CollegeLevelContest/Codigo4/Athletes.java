import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        Scanner sc = = new Scanner(System.in);
        int n = sc.nextInt();
        int po = sc.nextInt();
        ArrayList<Integer> starting = new ArrayList<>();
        ArrayList<Integer> ending = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int si = sc.nextInt();
            int ei = sc.nextInt();
            if(si > ei) {
                int temp = si;
                si = ei;
                ei = temp;
            }
            starting.add(si);
            ending.add(ei);
        }
        int l = Collections.max(starting);
        int r = Collections.min(ending);
        int ans = 0;
        if(l > r) {
            ans = -1;
        }else {
            if(po >= l && po <= r) {
                ans = 0;
            } else if(po <= l) {
                ans = Math.abs(po - l);
            } else if(po >= r) {
                ans = Math.abs(po - r);
            } else {
                ans = -1;
            }
        }
        System.out.println(ans);
    }
}
