package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10813 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]);
		
		int[] arr = new int[n + 1];
		
		for(int i = 1; i <= n; i++)
		{
			arr[i] = i;
		}
		
		for(int i = 0; i < m; i++)
		{
			String[] input = br.readLine().split(" ");
			
			int temp = arr[Integer.parseInt(input[0])];
			arr[Integer.parseInt(input[0])] = arr[Integer.parseInt(input[1])];
			arr[Integer.parseInt(input[1])] = temp;
		}
		
		for(int i = 1; i <= n; i++)
		{
			bw.write(arr[i] + " ");
		}
		bw.flush();

	}

}
