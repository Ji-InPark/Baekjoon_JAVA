package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1699 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input_num = Integer.parseInt(br.readLine());
		int[] dp = new int[input_num + 5];
		
		
		for(int i = 1; i <= input_num; i++)
		{
			dp[i] = i;
		}
		
		for(int i = 1; i <= input_num; i++)
		{
			for(int j = 1; j * j <= i; j++)
			{
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		
		bw.write(dp[input_num] + "\n");
		bw.flush();
	}

}
