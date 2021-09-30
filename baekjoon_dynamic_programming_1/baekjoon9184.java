package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon9184 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][][] dp = new int[21][21][21];
		
		for(int i = 1; i < 20; i++)
		{
			for(int j = 1; j < 20; j++)
			{
				Arrays.fill(dp[i][j], 0);
			}
		}
		
		while(true)
		{
			String[] input_string = new String[3];
			input_string = br.readLine().split(" ");
			
			int[] input_nums = new int[3];
			for(int i = 0; i < 3; i++)
			{
				input_nums[i] = Integer.parseInt(input_string[i]);
			}
			
			if(input_nums[0] == -1 & input_nums[1] == -1 & input_nums[2] == -1)
			{
				break;
			}
			else
			{
				bw.write("w(" + input_nums[0] + ", " + input_nums[1] + ", " + input_nums[2] + ") = " + w(input_nums[0], input_nums[1], input_nums[2], dp) + "\n");
			}
		}
		
		/*
		for(int i = 10; i < 20; i++)
		{
			for(int j = 1; j < 20; j++)
			{
				for(int k = 1; k < 20; k++)
				{
					bw.write("w(" + i + ", " + j + ", " + k + ") = " + w(i, j, k, dp)+ "\n");
					bw.flush();
				}
			}
			bw.write("-------------------------------------------\n");
			
		}
		//bw.write("w(" + 19 + ", " + 18 + ", " + 17 + ") = " + w(19, 18, 17)+ "\n");
		 */
		bw.flush();
		
	}
	
	public static int w(int a, int b, int c, int[][][] dp)
	{
		if(a <= 0 | b <= 0 | c <= 0)
		{
			return 1;
		}
		else if(a > 20 | b > 20| c > 20)
		{
			return 1048576;
		}
		else
		{
			if(a <= b | a <= c)
			{
				return (int)Math.pow(2, a);
			}
			else
			{
				if(a < b & b < c)
				{
					if(dp[a][b][c] != 0)
					{
						return dp[a][b][c];
					}
					else
					{						
						dp[a][b][c] = w(a, b, c - 1, dp) +  w(a, b-1, c - 1, dp) - w(a, b - 1, c, dp);	
						return dp[a][b][c];	
					}
				}
				else
				{
					if(dp[a][b][c] != 0)
					{
						return dp[a][b][c];
					}
					else
					{						
						dp[a][b][c] = w(a-1, b, c, dp) +  w(a-1, b-1, c, dp) + w(a-1, b, c-1, dp) - w(a-1, b-1, c-1, dp);	
						return dp[a][b][c];	
					}
				}		
			}
		}
	}

}