package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] input_num = new int[10005];
		int[] dp = new int[10005];
		
		for(int i = 3; i < N + 3; i++)
		{
			input_num[i] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		for(int i = 3; i < N + 3; i++)
		{
			dp[i] = Math.max(dp[i - 3] + input_num[i - 1] + input_num[i], dp[i - 2] + input_num[i]);
			dp[i] = Math.max(dp[i - 1], dp[i]);
			result = Math.max(dp[i], result);
		}
		bw.write(result + "\n");
		bw.flush();

	}

}
