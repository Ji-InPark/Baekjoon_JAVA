package baekjoon_input_output_calculation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_nums = new String[3];
		
		input_nums = br.readLine().split(" ");
		
		bw.write((Integer.parseInt(input_nums[0]) + Integer.parseInt(input_nums[1])) % Integer.parseInt(input_nums[2]) + "\n");
		bw.write(((Integer.parseInt(input_nums[0]) % Integer.parseInt(input_nums[2])) + (Integer.parseInt(input_nums[1]) % Integer.parseInt(input_nums[2]))) % Integer.parseInt(input_nums[2]) + "\n");
		bw.write((Integer.parseInt(input_nums[0]) * Integer.parseInt(input_nums[1])) % Integer.parseInt(input_nums[2]) + "\n");
		bw.write(((Integer.parseInt(input_nums[0]) % Integer.parseInt(input_nums[2])) * (Integer.parseInt(input_nums[1]) % Integer.parseInt(input_nums[2]))) % Integer.parseInt(input_nums[2]) + "\n");
		bw.flush();
		

	}

}
