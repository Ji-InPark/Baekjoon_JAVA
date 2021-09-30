package baekjoon_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_string = new String[2];
		int for_num = Integer.parseInt(br.readLine());
		int[][] input_array = new int[for_num][2];
		int[] result_array = new int[for_num];
		Arrays.fill(result_array, for_num);
		
		for(int i = 0; i < for_num; i++)
		{
			input_string = br.readLine().split(" ");
			input_array[i][0] = Integer.parseInt(input_string[0]);
			input_array[i][1] = Integer.parseInt(input_string[1]);
		}

		for(int i = 0; i < for_num; i++)
		{
			for(int j = i + 1; j < for_num; j++)
			{
				if(input_array[i][0] < input_array[j][0] && input_array[i][1] < input_array[j][1])
				{
					result_array[j]--;
				}
				else if(input_array[i][0] > input_array[j][0] && input_array[i][1] > input_array[j][1])
				{
					result_array[i]--;
				}
				else
				{
					result_array[j]--;
					result_array[i]--;
				}
			}
		}
		
		for(int i = 0; i < for_num; i++)
		{
			bw.write(result_array[i] + " ");
		}
		bw.flush();
	}

}
