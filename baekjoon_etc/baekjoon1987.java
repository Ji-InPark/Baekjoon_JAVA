package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1987 {

	static boolean[] visit;
	static int[][] arr;
	
	static int r, c, result = 0;
	
	static int[] ra = {0, 1, 0, -1};
	static int[] ca = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		r = Integer.parseInt(input_nums[0]);
		c = Integer.parseInt(input_nums[1]);
		
		arr = new int[r][c];
		
		visit = new boolean[30];
		
		for(int i = 0; i < r; i++)
		{
			String input = br.readLine();
			
			for(int j = 0; j < c; j++)
			{
				arr[i][j] = (int)(input.charAt(j) - 'A');
			}
		}
		
		solve(0, 0, 1);
		
		bw.write(result + "\n");
		bw.flush();
	}
	
	public static void solve(int x, int y, int length)
	{
		if(result < length)
			result = length;
		
		visit[arr[y][x]] = true;
		
		for(int i = 0; i < 4; i++)
		{
			if(x + ca[i] < c && x + ca[i] >= 0 && y + ra[i] < r && y + ra[i] >= 0)
			{
				if(!visit[arr[y + ra[i]][x + ca[i]]])
				{					
					solve(x + ca[i], y + ra[i], length + 1);
				}
			}
		}
		
		visit[arr[y][x]] = false;
	}

}
