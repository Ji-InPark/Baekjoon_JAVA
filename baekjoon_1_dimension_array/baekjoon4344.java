package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class baekjoon4344 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = scan.nextInt();
		
		for(int i = 0; i < for_num; i++)
		{
			int array_num = scan.nextInt(), over_average = 0;
			float average, sum = 0, result;
			int[] array = new int[array_num];
			for(int j = 0; j < array_num; j++)
			{
				array[j] = scan.nextInt();
				sum += (float)array[j];
			}
			
			average = sum / array_num;
			for(int j = 0; j < array_num; j++)
			{
				if(average < (float)array[j])
				{
					over_average++;
				}
			}
			
			result = (float)over_average / (float)array_num * 100;
			System.out.printf("%.3f%%\n", result);
		}
	}

}
