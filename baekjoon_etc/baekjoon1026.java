package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class baekjoon1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] A = new Integer[n], B = new Integer[n];
		
		String[] input_A = br.readLine().split(" ");
		String[] input_B = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++)
		{
			A[i] = Integer.parseInt(input_A[i]);
			B[i] = Integer.parseInt(input_B[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			result += A[i] * B[i];
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
