package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10026 {
	
	static int[][] rgb, b;
	static boolean[][] rgb_v, b_v;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), rgb_result = 0, b_result = 0;
		
		rgb = new int[n + 2][n + 2]; b = new int[n + 2][n + 2];
		rgb_v = new boolean[n + 2][n + 2]; b_v = new boolean[n + 2][n + 2];
		
		for(int i = 1; i <= n; i++)
		{
			String input = br.readLine();
			
			for(int j = 0; j < input.length(); j++)
			{
				b[i][j + 1] = 1;
				if(input.charAt(j) == 'R')
				{
					rgb[i][j + 1] = 1;
				}
				else if(input.charAt(j) == 'G')
				{
					rgb[i][j + 1] = 2;
				}
				else
				{
					rgb[i][j + 1] = 3;
					b[i][j + 1] = 3;
				}
			}
		}
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(!rgb_v[i][j])
				{
					search_rgb(j, i, rgb[i][j]);
					rgb_result++;
				}
				if(!b_v[i][j])
				{
					search_b(j, i, b[i][j]);
					b_result++;
				}
			}
		}
		
		bw.write(rgb_result + " " + b_result);
		bw.flush();

	}
	
	public static void search_rgb(int x, int y, int color)
	{
		rgb_v[y][x] = true;
		
		if(rgb[y][x + 1] == color && !rgb_v[y][x + 1])
		{
			search_rgb(x + 1, y, color);
		}
		if(rgb[y][x - 1] == color && !rgb_v[y][x - 1])
		{
			search_rgb(x - 1, y, color);
		}
		if(rgb[y + 1][x] == color && !rgb_v[y + 1][x])
		{
			search_rgb(x, y + 1, color);
		}
		if(rgb[y - 1][x] == color && !rgb_v[y - 1][x])
		{
			search_rgb(x, y - 1, color);
		}
	}
	
	public static void search_b(int x, int y, int color)
	{
		b_v[y][x] = true;
		
		if(b[y][x + 1] == color && !b_v[y][x + 1])
		{
			search_b(x + 1, y, color);
		}
		if(b[y][x - 1] == color && !b_v[y][x - 1])
		{
			search_b(x - 1, y, color);
		}
		if(b[y + 1][x] == color && !b_v[y + 1][x])
		{
			search_b(x, y + 1, color);
		}
		if(b[y - 1][x] == color && !b_v[y - 1][x])
		{
			search_b(x, y - 1, color);
		}
	}
}
