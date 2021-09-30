package baekjoon_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_nums = new String[2];
		
		input_nums = br.readLine().split(" ");
		
		String[] input_array = new String[Integer.parseInt(input_nums[0])];
		
		input_array = br.readLine().split(" ");
		
		for(int i = 0; i < Integer.parseInt(input_nums[0]); i++)
		{
			if(Integer.parseInt(input_array[i]) < Integer.parseInt(input_nums[1]))
			{
				bw.write(Integer.parseInt(input_array[i]) + " ");
			}
		}
		bw.flush();

	}

}
