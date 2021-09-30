package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[3000005];
		Arrays.fill(dp, 3000000);
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i = 2; i <= N; i++)
		{
				dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
				dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
				dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
		}
		
		bw.write(dp[N] + "\n");
		bw.flush();
	}

}
