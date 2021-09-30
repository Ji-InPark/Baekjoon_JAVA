package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_nums = new String[3];
		input_nums = br.readLine().split(" ");
		
		int[] nums = new int[3];
		for(int i = 0; i < 3; i++)
		{
			nums[i] = Integer.parseInt(input_nums[i]);
		}
		
		
		if((nums[2] - nums[0]) % (nums[0] - nums[1]) == 0)
		{
			bw.write(1 + (nums[2] - nums[0]) / (nums[0] - nums[1]) + " ");
		}
		else
		{
			bw.write(2 + (nums[2] - nums[0]) / (nums[0] - nums[1]) + " ");
		}
		
		bw.flush();
	}

}
