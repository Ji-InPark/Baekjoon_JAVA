package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10844 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[105][10];
		
		if(N == 1)
			bw.write(9 + "\n");
		else
		{
			for(int j = 0; j <= 9; j++)
			{
				dp[N][j] = 1;
			}
			
			for(int i = N - 1; i > 0; i--)
			{
				for(int j = 1; j < 9; j++)
				{
					dp[i][j] += dp[i + 1][j - 1] + dp[i + 1][j + 1];
					dp[i][j] %= 1000000000;
				}
				dp[i][0] += dp[i + 1][1];
				dp[i][0] %= 1000000000;
				dp[i][9] += dp[i + 1][8];
				dp[i][9] %= 1000000000;
			}
			
			long result = 0;
			for(int j = 1; j <= 9; j++)
			{
				result += dp[1][j];
			}
			
			result %= 1000000000;
			
			bw.write(result + "\n");
		}
		
		bw.flush();
	}

}
