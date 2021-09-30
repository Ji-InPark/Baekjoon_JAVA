package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] dp = new long[100];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i <= n; i++)
		{
			dp[i] = 1;
			for(int j = i - 2; j > 0; j--)
			{				
				dp[i] += dp[j];
			}
		}
		
		bw.write(dp[n] + "\n");
		bw.flush();
	}

}
