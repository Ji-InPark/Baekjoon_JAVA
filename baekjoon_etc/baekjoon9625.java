package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon9625 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input_num = Integer.parseInt(br.readLine());
		
		long[] array_A = new long[50];
		long[] array_B = new long[50];
		
		array_A[0] = 1;
		array_A[1] = 0;
		array_A[2] = 1;
		array_A[3] = 1;
		
		array_B[0] = 0;
		array_B[1] = 1;
		array_B[2] = 1;
		array_B[3] = 2;
		
		if(input_num < 4)
		{
			bw.write(array_A[input_num] + " " + array_B[input_num]);
		}
		else
		{
			for(int i = 4; i <= input_num; i++)
			{
				array_A[i] = array_A[i - 2] + array_A[i - 1];
				array_B[i] = array_B[i - 2] + array_B[i - 1];
			}
			bw.write(array_A[input_num] + " " + array_B[input_num]);
		}
		
		bw.flush();

	}

}
