package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(arr);
		
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			result += arr[i] * (n - i);
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
