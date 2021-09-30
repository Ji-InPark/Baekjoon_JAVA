package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int array_num = Integer.parseInt(br.readLine());
		double result = 0.0,  max = 0.0;
		String[] array = new String[array_num];
		
		array = br.readLine().split(" ");
		
		for(int i = 0; i < array_num; i++)
		{
			if(max < Float.parseFloat(array[i]))
			{
				max = Float.parseFloat(array[i]);
			}
		}
		
		for(int i = 0; i < array_num; i++)
		{
			result += Float.parseFloat(array[i]) / max * 100;
		}
		
		result /= array_num;
		
		bw.write(result + " ");
		bw.flush();
	}

}
