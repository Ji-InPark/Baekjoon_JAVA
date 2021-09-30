package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1028 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		int x = Integer.parseInt(input_nums[1]), y = Integer.parseInt(input_nums[0]);
		
		int[][][] dp = new int[752][752][2];
		int rb = 0, lb = 1, result = 0;
		
		boolean is_zero = true;
		
		for(int i = 1; i <= y; i++)
		{
			String[] input_string = br.readLine().split("");
			
			for(int j = 1; j <= x; j++)
			{
				if(input_string[j - 1].equals("1"))
				{
					is_zero = false;
					dp[i][j][rb] = dp[i][j][lb] = 1;
				}
				else
				{
					dp[i][j][rb] = dp[i][j][lb] = 0;
				}
			}
		}
		
		if(is_zero)
		{
			bw.write("0\n");
		}
		else
		{
			for(int i = y - 1; i >= 1; i--)
			{
				for(int j = 1; j <= x; j++)
				{
					dp[i][j][rb] *= 1 + dp[i + 1][j + 1][rb];
					dp[i][j][lb] *= 1 + dp[i + 1][j - 1][lb];
				}
			}
			
			for(int i = 1; i <= y; i++)
			{
				for(int j = 1; j <= x; j++)
				{
					for(int temp = dp[i][j][lb] - 1; temp >= result; temp--)
					{
						if(dp[i][j][rb] >= temp + 1 && dp[i + temp][j + temp][lb] >= temp + 1 && dp[i + temp][j - temp][rb] >= temp + 1)
						{
							result = temp + 1;
						}
					}
				}
			}
			bw.write(result + "\n");
		}
		bw.flush();
	}
	

}
