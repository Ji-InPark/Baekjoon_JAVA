package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] sum = new int[n + 1];
		sum[0] = 0;
		
		for(int i = 1; i <= n; i++)
		{
			sum[i] = sum[i - 1] + Integer.parseInt(input[i - 1]);
		}
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_nums = br.readLine().split(" ");
			
			bw.write((sum[Integer.parseInt(input_nums[1])] - sum[Integer.parseInt(input_nums[0]) - 1]) + "\n");
		}
		
		bw.flush();
	}

}
