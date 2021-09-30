package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]), k = Integer.parseInt(input1[1]);
		int[] coins = new int[n];
		int[] dp = new int[20000];
		
		for(int i = 0; i < n; i++)
		{
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		
		Arrays.sort(coins);
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j <= k; j++)
			{
				if(j >= coins[i])
				{
					dp[j] += dp[j - coins[i]];
				}
			}
		}
		
		
		bw.write(dp[k] + "\n");
		bw.flush();
		
		
	}

}
