package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		int[] dp1 = new int[1005];
		int[] dp2 = new int[1005];
		
		String[] input_string = br.readLine().split(" ");
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(input_string[i]);
		}
		
		
		int result = 0;
		for(int i = 0; i < N; i++)
		{
			for (int j = i; j < N; j++) 
			{
				if(nums[i] < nums[j])
				{
					dp1[j] = Math.max(dp1[j], dp1[i] + 1);
				}
			}
		}
		
		for(int i = N - 1; i >= 0; i--)
		{
			for (int j = i; j >= 0; j--) 
			{
				if(nums[i] < nums[j])
				{
					dp2[j] = Math.max(dp2[j], dp2[i] + 1);
				}
			}
		}
		
		for(int i = 0; i < N; i++)
		{
			result = Math.max(result, dp1[i] + dp2[i]);
		}
		
		result++;
		bw.write(result + "\n");
		bw.flush();

	}

}
