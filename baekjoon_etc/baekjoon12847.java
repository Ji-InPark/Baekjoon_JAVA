package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon12847 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_num = br.readLine().split(" ");
		int n = Integer.parseInt(input_num[0]), m = Integer.parseInt(input_num[1]);
		
		long[] sum = new long[n + 1];
		
		String[] input = br.readLine().split(" ");
		
		for(int i = 1; i <= n; i++) 
		{
			sum[i] = sum[i - 1] + Integer.parseInt(input[i - 1]);
		}
		
		long result = 0;
		
		for(int i = m; i <= n; i++)
		{
			result = Math.max(result, sum[i] - sum[i - m]);
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
