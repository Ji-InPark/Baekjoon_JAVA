package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon9663 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[][] queen_array = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				queen_array[i][j] = 0;
			}
		}
		
		int[] result = new int[1];
		result[0] = 0;
		
		System.out.println(n_queen(n, 1, result, queen_array));
	}
	
	public static int n_queen(int n, int qn, int[] result, int[][] qa)
	{
		for(int j = 0; j < n; j++)
		{
			if(check_queen_array(n, j, qn - 1, qa))
			{
				qa[qn - 1][j] = qn;
				if(qn == n)
				{
					result[0] += 1;			
				}
				else
				{
					n_queen(n, qn + 1, result, qa);
				}
				qa[qn - 1][j] = 0;
			}
			else
			{
				continue;
			}
		}
		return result[0];
	}
	
	public static boolean check_queen_array(int n, int x, int y, int[][] qa)
	{
		if(qa[y][x] != 0)
		{
			return false;
		}
		else
		{
			int i = 0;
			while(x + i != n && y - i != -1)
			{
				if(qa[y - i][x + i] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			i = 0;
			while(x + i != n)
			{
				if(qa[y][x + i] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			
			i = 0;
			while(x + i != n && y + i != n)
			{
				if(qa[y + i][x + i] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			i = 0;
			while(y + i != n)
			{
				if(qa[y + i][x] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			i = 0;
			while(x - i != -1 && y + i != n)
			{
				if(qa[y + i][x - i] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			i = 0;
			while(x - i != -1)
			{
				if(qa[y][x - i] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			i = 0;
			while(x - i != -1 && y - i != -1)
			{
				if(qa[y - i][x - i] != 0)
				{
					return false;
				}
				i += 1;
			}
			
			i = 0;
			while(y - i != -1)
			{
				if(qa[y - i][x] != 0)
				{
					return false;
				}
				i += 1;
			}
		}
		return true;
	}
}
