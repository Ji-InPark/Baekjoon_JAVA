package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < for_num; a++)
		{
			String[] input_string = br.readLine().split(" ");
			int w = Integer.parseInt(input_string[0]), h = Integer.parseInt(input_string[1]), num = Integer.parseInt(input_string[2]);
			int ans = 0;
			
			int[][] array = new int[h + 2][w + 2];
			boolean[][] visited = new boolean[h + 2][w + 2];
			
			
			for(int i = 0; i < h + 2; i++)
			{
				Arrays.fill(array[i], 0);
				Arrays.fill(visited[i], false);
			}
			
			for(int i = 0; i < h + 2; i++)
			{
				array[i][0] = 1;
				array[i][w + 1] = 1;
				visited[i][0] = true;
				visited[i][w + 1] = true;
			}
			for(int i = 0; i < w + 2; i++)
			{
				array[0][i] = 1;
				array[h + 1][i] = 1;
				visited[0][i] = true;
				visited[h + 1][i] = true;
			}
			
			for(int i = 0; i < num; i++)
			{
				String[] input_nums = br.readLine().split(" ");
				int x = Integer.parseInt(input_nums[0]), y = Integer.parseInt(input_nums[1]);
				
				array[y + 1][x + 1] = 1;
			}
			
			for(int i = 1; i < h + 1; i++)
			{
				for(int j = 1; j < w + 1; j++)
				{
					if(array[i][j] == 1 && !visited[i][j])
					{
						check(array, visited, i , j);
						ans++;
					}
				}
			}
			
			bw.write(ans + "\n");
		}
		bw.flush();
	}

	private static void check(int[][] array, boolean[][] visited, int y, int x) {
		
		visited[y][x] = true;
		
		if(!visited[y + 1][x] && array[y + 1][x] == 1)
		{
			check(array, visited, y + 1, x );
		}
		if(!visited[y - 1][x] && array[y - 1][x] == 1)
		{
			check(array, visited, y - 1, x);
		}
		if(!visited[y][x + 1] && array[y][x + 1] == 1)
		{
			check(array, visited, y, x + 1);
		}
		if(!visited[y][x - 1] && array[y][x - 1] == 1)
		{
			check(array, visited, y, x - 1);
		}
	}

}
