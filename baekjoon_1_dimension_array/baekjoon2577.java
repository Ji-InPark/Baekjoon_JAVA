package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input_num = 1;
		int[] num_array = new int[10];
		Arrays.fill(num_array, 0);
		
		for(int i = 0; i < 3; i++)
		{
			input_num *= Integer.parseInt(br.readLine());
		}
		
		while(input_num / 10 != 0)
		{
			num_array[input_num % 10]++;
			input_num /= 10;
		}
		num_array[input_num % 10]++;
		
		
		for(int i = 0; i < 10; i++)
		{
			bw.write(num_array[i] + "\n");
		}
		bw.flush();

	}

}
