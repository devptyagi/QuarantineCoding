import java.util.*;

public class Solution {
    
    static boolean duplicate(int[] a) {
        int count = 0;
        for (int i = 0; i<a.length; i++) 
        {
            for(int j = 0; j<a.length; j++)
            {
                if (i != j && a[i] == a[j])
                {
                    return true;
                }
            }    
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(t-- != 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            int k = 0;
            int duplicateRow = 0;
            int duplicateCol = 0;
            
            for(int i=0;i<n;i++)
            {
                if(duplicate(arr[i])) duplicateRow++;
                int[] column = new int[arr[i].length]; 
                for(int j=0;j<n;j++)
                {
                    if(i == j) k += arr[i][j];
                    column[j] = arr[j][i];
                }
                if(duplicate(column)) duplicateCol++;
            }
            
            System.out.println("Case #"+x+": "+k+" "+duplicateRow+" "+duplicateCol);
            x++;
            
        }
    }
}