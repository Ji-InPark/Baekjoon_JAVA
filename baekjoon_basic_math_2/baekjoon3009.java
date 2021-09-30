package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] array_x = new int[3], array_y = new int[3];
		int temp_x, temp_y, result_x = 0, result_y = 0;
		
		for(int i = 0; i < 3; i++)
		{
			String[] input_string = new String[2];
			input_string = br.readLine().split(" ");
			
			array_x[i] = Integer.parseInt(input_string[0]);
			array_y[i] = Integer.parseInt(input_string[1]);
		}

		temp_x = array_x[0];
		temp_y = array_y[0];
		
		boolean flag_x = true, flag_y = true;
		
		for(int i = 1; i <= 2; i++)
		{
			if(temp_x == array_x[i])
			{
				flag_x = false;
			}
			
			if(temp_y == array_y[i])
			{
				flag_y = false;
			}
		}
		
		if(flag_x)
		{
			result_x = temp_x;
		}
		else
		{
			for(int i = 1; i <= 2; i++)
			{
				if(temp_x != array_x[i])
				{
					result_x = array_x[i];
				}
			}
		}
		
		if(flag_y)
		{
			result_y = temp_y;
		}
		else
		{
			for(int i = 1; i <= 2; i++)
			{
				if(temp_y != array_y[i])
				{
					result_y = array_y[i];
				}
			}
		}
		
		bw.write(result_x + " " + result_y);
		bw.flush();
	}


}
