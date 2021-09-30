package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] remainder_nums = new int[42];
		int result = 0;
		Arrays.fill(remainder_nums, 0);

		for(int i = 0; i < 10; i++)
		{
			int input_num = Integer.parseInt(br.readLine());
			remainder_nums[input_num % 42]++;
		}
		
		for(int i = 0; i < 42; i++)
		{
			if(remainder_nums[i] != 0)
			{
				result++;
			}
		}
		
		System.out.println(result);
	}

}
