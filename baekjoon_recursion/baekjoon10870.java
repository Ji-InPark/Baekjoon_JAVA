package baekjoon_recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] fibonacci = new int[21];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int i = 2; i < 21; i++)
		{
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write(fibonacci[n] + "");
		bw.flush();
	}

}
