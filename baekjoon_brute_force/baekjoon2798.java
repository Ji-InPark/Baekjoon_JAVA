package baekjoon_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] for_num_and_m = new String[2];
		for_num_and_m = br.readLine().split(" ");

		String[] input_string = new String[Integer.parseInt(for_num_and_m[0])];
		int[] input_nums = new int[Integer.parseInt(for_num_and_m[0])], result = new int[2];
		
		input_string = br.readLine().split(" ");
		for(int i = 0; i < Integer.parseInt(for_num_and_m[0]); i++)
		{
			input_nums[i] = Integer.parseInt(input_string[i]);
		}
		int m = Integer.parseInt(for_num_and_m[1]);
		result[0] = 0;
		
		black_jack(0, 0, 0, m, input_nums, result);
		bw.write(result[0] + "");
		bw.flush();
		
	}
	
	public static void black_jack(int n, int pre_num, int pre_index, int m, int[] input_nums, int[] result)
	{
		if(n == 2)
		{
			for(int i = pre_index; i < input_nums.length; i++)
			{
				if(pre_num + input_nums[i] == m)
				{
					result[0] = m;
				}
				else if(m - (pre_num + input_nums[i]) >= 0 && m - result[0] > m - (pre_num + input_nums[i]))
				{
					result[0] = pre_num + input_nums[i];
				}
			}
		}
		else
		{
			for(int i = pre_index; i < input_nums.length - (2 - n); i++)
			{
				black_jack(n + 1, pre_num + input_nums[i], i + 1, m, input_nums, result);
			}
		}
	}

}
