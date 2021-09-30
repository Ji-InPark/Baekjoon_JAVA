package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int array_num = Integer.parseInt(br.readLine());
		int max = 0, min = 0;
		String[] input_nums = new String[array_num];
		
		input_nums = br.readLine().split(" ");
		
		for(int i = 0; i < array_num; i++)
		{
			if(i == 0)
			{
				max = Integer.parseInt(input_nums[i]);
				min = Integer.parseInt(input_nums[i]);
			}
			else
			{
				if(max < Integer.parseInt(input_nums[i])) 
				{
					max = Integer.parseInt(input_nums[i]);
				}
				else if(min > Integer.parseInt(input_nums[i]))
				{
					min = Integer.parseInt(input_nums[i]);
				}
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
	}

}
