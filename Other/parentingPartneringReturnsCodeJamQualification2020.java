import java.util.*;
import java.io.*;

class Task {
	int start;
	int end;
	int index;
	
	public Task(int s, int e, int i) {
		this.start = s;
		this.end = e;
		this.index = i;
	}
	
	int getStart() {
		return this.start;
	}
}

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x = 1;
		while(t-- != 0)
		{
			int n = sc.nextInt();
			List<Task> activities = new ArrayList<>(n);
			for(int i=0;i<n;i++)
			{
				int s = sc.nextInt();
				int e = sc.nextInt();
				activities.add(new Task(s, e, i));
			}
			char parent = 'C';
			char[] result = new char[n];
			
			boolean possible = true;
			int cEnd = 0;
			int jEnd = 0;
			
			activities.sort(Comparator.comparing(Task::getStart));
			
			for(int i=0;i<n;i++)
			{
				Task currentTask = activities.get(i);
				if(currentTask.start >= cEnd)
				{
					result[currentTask.index] = 'C';
					cEnd = currentTask.end;
				}
				else if(currentTask.start >= jEnd)
				{
					result[currentTask.index] = 'J';
					jEnd = currentTask.end;
				}
				else
				{
					possible = false;
					break;
				}
			}
			
			if(possible)
			{
				System.out.println("Case #"+x+": "+String.valueOf(result));
			}
			else
			{
				System.out.println("Case #"+x+": "+"IMPOSSIBLE");
			}
			x++;
		}
	}

}
