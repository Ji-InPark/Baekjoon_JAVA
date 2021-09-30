package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon2178 {

	static int result = 0;
	static boolean[][] arr; 
	static boolean[][] visited;
	static int n, m;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		
		arr = new boolean[n + 2][m + 2];
		visited = new boolean[n + 2][m + 2];
		
		for(int i = 0; i < n; i++)
		{
			String temp = br.readLine();
			
			for(int j = 0; j < temp.length(); j++)
			{
				if(temp.charAt(j) == '1')
					arr[i + 1][j + 1] = true;
				else
					arr[i + 1][j + 1] = false;
			}	
		}
		
		solve();
		
		bw.write(result + "\n");
		bw.flush();

	}
	
	public static void solve()
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(1);
		
		visited[1][1] = true;
	
		LOOP:
		while(!q.isEmpty())
		{
			result++;
			
			int size = q.size() / 2;
			
			for(int i = 0; i < size; i++)
			{
				int x = q.poll();
				int y = q.poll();
				
				if(x == m && y == n)
					break LOOP;
				
				if(arr[y + 1][x] && !visited[y + 1][x])
				{
					q.add(x);
					q.add(y + 1);
					visited[y + 1][x] = true;
				}
				if(arr[y][x + 1] && !visited[y][x + 1])
				{
					q.add(x + 1);
					q.add(y);
					visited[y][x + 1] = true;
				}
				if(arr[y - 1][x] && !visited[y - 1][x])
				{
					q.add(x);
					q.add(y - 1);
					visited[y - 1][x] = true;
				}
				if(arr[y][x - 1] && !visited[y][x - 1])
				{
					q.add(x - 1);
					q.add(y);
					visited[y][x - 1] = true;
				}
			}
		}
	}

}
