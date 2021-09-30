package baekjoon_sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10];
		
		while(N != 0)
		{
			arr[N % 10]++;
			N /= 10;
		}
		
		int result = 0;
		
		for(int i = 9; i >= 0; i--)
		{
			for(int j = 0; j < arr[i]; j++)
			{
				result *= 10;
				result += i;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
