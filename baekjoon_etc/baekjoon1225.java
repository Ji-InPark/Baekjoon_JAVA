package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1225 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr1 = new int[10000];
		int[] arr2 = new int[10000];
		
		String[] input_string = br.readLine().split(" ");
		for(int i = 0; i < input_string[0].length(); i++)
		{
			arr1[i] = (int)input_string[0].charAt(i) - '0';
		}
		
		for(int i = 0; i < input_string[1].length(); i++)
		{
			arr2[i] = (int)input_string[1].charAt(i) - '0';
		}

		long result = 0;
		for(int i = 0; i < input_string[0].length(); i++)
		{
			for (int j = 0; j < input_string[1].length(); j++) 
			{
				result += arr1[i] * arr2[j];
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
