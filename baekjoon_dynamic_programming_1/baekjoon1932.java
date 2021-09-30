package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[502][502];
		int[][] input = new int[502][];
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_nums = br.readLine().split(" ");
			input[i] = new int[input_nums.length];
			for(int j = 0; j < input_nums.length; j++)
			{
				input[i][j] = Integer.parseInt(input_nums[j]);
			}
		}
		
		dp[0][0] = input[0][0];
		for(int i = 1; i < for_num; i++)
		{
			for(int j = 0; j < input[i].length; j++)
			{
				if(j == 0)
				{					
					dp[i][j] = dp[i - 1][j] + input[i][j];
				}
				else
				{
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + input[i][j];
				}
			}
		}
		
		int result = -1;
		for(int j = 0; j < input[for_num - 1].length; j++)
		{
			result = Math.max(dp[for_num - 1][j], result);
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
