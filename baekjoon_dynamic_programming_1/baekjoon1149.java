package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1149 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		int[][] dp = new int[for_num][3];
		int[][] input_nums = new int[for_num][3];
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_string = br.readLine().split(" ");
			for(int j = 0; j < 3; j++)
			{
				input_nums[i][j] = Integer.parseInt(input_string[j]);
			}
		}
		dp[0][0] = input_nums[0][0];
		dp[0][1] = input_nums[0][1];
		dp[0][2] = input_nums[0][2];
		
		for(int i = 1; i < for_num; i++)
		{
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + input_nums[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + input_nums[i][1];
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + input_nums[i][2];
		}
		
		int result = 1000000;
		
		for(int i = 0; i < 3; i++)
		{
			if(dp[for_num - 1][i] < result)
			{
				result = dp[for_num - 1][i];
			}
		}
		
		bw.write(result + "");
		bw.flush();
	}
}
