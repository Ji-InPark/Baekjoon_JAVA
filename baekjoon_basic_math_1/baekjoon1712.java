package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_strings = new String[3];
		long[] input_nums = new long[3];
		
		input_strings = br.readLine().split(" ");
		
		for(int i = 0; i < 3; i++)
		{
			input_nums[i] = Integer.parseInt(input_strings[i]);
		}
		
		if(input_nums[1] >= input_nums[2])
		{
			System.out.println(-1);
		}
		else
		{
			long temp = input_nums[2] - input_nums[1];
			long result = input_nums[0] / temp + 1;
			System.out.println(result);
		}

	}

}
