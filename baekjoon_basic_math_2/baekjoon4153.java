package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true)
		{
			int[] nums = new int[3];
			int max_index, max_result = 0, other_result = 0;
			String[] input_string = new String[3];
			input_string = br.readLine().split(" ");
			
			max_index = 0;
			
			for(int i = 0; i < 3; i++)
			{
				nums[i] = Integer.parseInt(input_string[i]);
				if(nums[max_index] < nums[i])
				{
					max_index = i;
				}
			}
			
			for(int i = 0; i < 3; i++)
			{
				if(i == max_index)
				{
					max_result += nums[i] * nums[i];
				}
				else
				{
					other_result += nums[i] * nums[i];	
				}
			}
			
			if(Integer.parseInt(input_string[0]) == 0)
			{
				break;
			}
			else
			{
				if(max_result == other_result) 
				{
					bw.write("right\n");
				}
				else
				{
					bw.write("wrong\n");
				}
			}
		}
		bw.flush();
	}

}
