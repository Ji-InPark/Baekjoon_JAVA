package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2565 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[505];
		
		int[] dp1 = new int[1005];
		int[] dp2 = new int[1005];
		
		for(int i = 0; i < N; i++)
		{
			String[] input_string = br.readLine().split(" ");
			nums[Integer.parseInt(input_string[0])] = Integer.parseInt(input_string[1]);
		}
		
		
		int result = 0;
		for(int i = 1; i <= 500; i++)
		{
			if(nums[i] != 0)
			{
				for (int j = i; j <= 500; j++) 
				{
					if(nums[j] != 0)
					{
						if(nums[i] < nums[j])
						{
							dp1[j] = Math.max(dp1[j], dp1[i] + 1);
							result = Math.max(dp1[j], result);
						}
					}
				}
			}
		}
		/*
		for(int i = 500; i > 0; i--)
		{
			if(nums[i] != 0)
			{
				for (int j = i; j > 0; j--) 
				{
					if(nums[j] != 0)
					{
						if(nums[i] < nums[j])
						{
							dp2[j] = Math.max(dp2[j], dp2[i] + 1);
							result = Math.max(dp2[j], result);
						}
					}		
				}
			}
		}
		*/
		result++;
		result = N - result;
		bw.write(result + "\n");
		bw.flush();

	}

}
