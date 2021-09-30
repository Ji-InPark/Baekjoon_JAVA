package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2667 {
	
	public static int result = 0;
	public static int[] result_arr;
	public static boolean[][] visit, arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new boolean[n + 2][n + 2];
		visit = new boolean[n + 2][n + 2];
		result_arr = new int[n * n];
		
		for(int i = 0; i < n + 2; i++)
		{
			visit[0][i] = true;
			visit[n + 1][i] = true;
			visit[i][0] = true;
			visit[i][n + 1] = true;
		}
		
		for(int i = 1; i <= n; i++)
		{
			String[] input = br.readLine().split("");
			
			for(int j = 1; j <= n; j++)
			{
				arr[i][j] = Integer.parseInt(input[j - 1]) == 1;
			}
		}
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(!visit[i][j] && arr[i][j])
				{
					search(j, i);
					result++;
				}
			}
		}
		
		Arrays.sort(result_arr, 0, result);
		
		bw.write(result + "\n");
		for(int i = 0; i < result; i++)
		{
			bw.write(result_arr[i] + "\n");
		}
		bw.flush();

	}
	
	public static void search(int x, int y)
	{
		result_arr[result]++;
		
		visit[y][x] = true;
		
		if(!visit[y][x + 1] && arr[y][x + 1])
		{
			search(x + 1, y);
		}
		if(!visit[y][x - 1] && arr[y][x - 1])
		{
			search(x - 1, y);
		}
		if(!visit[y + 1][x] && arr[y + 1][x])
		{
			search(x, y + 1);
		}
		if(!visit[y - 1][x] && arr[y - 1][x])
		{
			search(x, y - 1);
		}
	}

}
