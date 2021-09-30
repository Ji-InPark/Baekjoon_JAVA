package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon1005 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < for_num; a++)
		{
			String[] input_nums = br.readLine().split(" ");
			int n = Integer.parseInt(input_nums[0]), k = Integer.parseInt(input_nums[1]);
			
			String[] input_weights = br.readLine().split(" ");
			int[] weights = new int[n + 1];
			for(int i = 1; i <= n; i++)
			{
				weights[i] = Integer.parseInt(input_weights[i - 1]);
			}
			
			ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
			int[] indeg = new int[n + 5];
			int[] dp = new int[n + 5];
			
			for(int i = 0; i <= n; i++)
			{
				arr.add(new ArrayList<Integer>());
			}
			
			for(int i = 0; i < k; i++)
			{
				String[] input = br.readLine().split(" ");
				
				arr.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
				indeg[Integer.parseInt(input[1])]++;
			}
			
			int w = Integer.parseInt(br.readLine());
			
			Queue<Integer> q = new LinkedList<Integer>();
			
			for(int i = 1; i <= n; i++)
			{
				if(indeg[i] == 0)
				{
					q.add(i);
					dp[i] = weights[i];
				}
			}
			
			while(!q.isEmpty())
			{
				int now = q.poll();
				
				if(now == w)
					break;
				
				for(int i = 0; i < arr.get(now).size(); i++)
				{
					int next = arr.get(now).get(i);
					
					if(--indeg[next] == 0)
						q.add(next);
					
					if(dp[next] < dp[now] + weights[next])
					{
						dp[next] = dp[now] + weights[next];
					}
				}
			}
			
			bw.write(dp[w] + "\n");
		}
		bw.flush();

	}

}
