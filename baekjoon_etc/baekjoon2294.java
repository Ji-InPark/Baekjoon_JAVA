package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2294 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_num = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_num[0]), k = Integer.parseInt(input_num[1]), result = 0;
		
		int[] arr = new int[n], dp = new int[150000];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++)
		{
			dp[arr[i]] = 1;
			for(int j = 0; j <= k; j++)
			{
				if(dp[j] != Integer.MAX_VALUE)
				{
					dp[j + arr[i]] = Math.min(dp[j + arr[i]], dp[j] + 1);
				}
			}
		}
		
		if(dp[k] == Integer.MAX_VALUE)
		{
			bw.write("-1");
		}
		else
		{
			bw.write(dp[k] + "\n");
		}
		
		bw.flush();
	}

}
