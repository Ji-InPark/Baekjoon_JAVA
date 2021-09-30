package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		
		String[] input_nums = new String[3];
		
		for(int i = 0; i < for_num; i++)
		{
			input_nums = br.readLine().split(" ");
			
			if((Integer.parseInt(input_nums[2]) % Integer.parseInt(input_nums[0])) == 0)
			{
				bw.write(100 * (Integer.parseInt(input_nums[0])) + (Integer.parseInt(input_nums[2]) / Integer.parseInt(input_nums[0])) + "\n");
			}
			else
			{
				bw.write(100 * (Integer.parseInt(input_nums[2]) % Integer.parseInt(input_nums[0])) + (Integer.parseInt(input_nums[2]) / Integer.parseInt(input_nums[0]) + 1) + "\n");				
			}
		}
		bw.flush();

	}

}
