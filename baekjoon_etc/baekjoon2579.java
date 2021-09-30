package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] input_nums = new int[size + 3];
		int[] dp0 = new int[size + 3];
		int[] dp1 = new int[size + 3];
		
		for(int i = 0; i < size; i++)
		{
			input_nums[i] = Integer.parseInt(br.readLine());
		}
		
		if(size == 1)
		{
			bw.write(input_nums[0] + "\n");
		}
		else if(size == 2)
		{
			bw.write(input_nums[0] + input_nums[1] + "\n");
		}
		else
		{
			Arrays.fill(dp0, 0);
			Arrays.fill(dp1, 0);
			
			dp1[1] = input_nums[0];
			dp0[2] = input_nums[0];
			dp1[2] = input_nums[1];
			
			for(int i = 1; i < size - 1; i++)
			{
				if(dp0[i] != 0)
				{
					dp1[i + 1] = Math.max(input_nums[i] + dp0[i], dp1[i + 1]);
					dp0[i + 2] = Math.max(input_nums[i] + dp0[i], dp0[i + 2]);
				}
				if(dp1[i] != 0)
				{
					dp0[i + 2] = Math.max(input_nums[i] + dp1[i], dp0[i + 2]);
				}
			}
			
			bw.write(Math.max(dp0[size - 1], dp1[size - 1]) + input_nums[size - 1] + "\n");
		}
		
		bw.flush();
	}

}
