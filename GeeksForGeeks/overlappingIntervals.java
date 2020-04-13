  
/* Given a set of time intervals in any order, merge all overlapping intervals into one and 
 * output the result which should have only mutually exclusive intervals.    
 * Let the intervals be represented as pairs of integers for simplicity.     
 */

import java.util.*;

class Interval {
    int start;
    int end;
    
    public Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
    
    public int getStart() {
        return this.start;
    }
    
}

class Solution {
    
    static void mergeIntervals(ArrayList<Interval> intervals) {
        
        if(intervals == null) {
            return;
        }else if(intervals.size() == 0) {
            return;
        }
        
        intervals.sort(Comparator.comparing(Interval::getStart));
        
        ArrayDeque<Interval> intervalStack = new ArrayDeque<>();
        
        intervalStack.push(intervals.get(0));
        
        for(int i=1;i<intervals.size();i++) {
            Interval top = intervalStack.peek();
            
            if(top.end < intervals.get(i).start) {
                intervalStack.push(intervals.get(i));
            } else if(top.end < intervals.get(i).end) {
                top.end = intervals.get(i).end;
                intervalStack.pop();
                intervalStack.push(top);
            }
        }
        
        while(!intervalStack.isEmpty()) {
            Interval t = intervalStack.pollLast();
            System.out.print(t.start+" "+t.end+" ");
        }
        
        
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- != 0) {
		    int n = sc.nextInt();
		    ArrayList<Interval> intervals = new ArrayList<>();
		    for(int i=0;i<n;i++) {
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        intervals.add(new Interval(x, y));
		    }
		    mergeIntervals(intervals);
		    System.out.println();
		}
	}
}
