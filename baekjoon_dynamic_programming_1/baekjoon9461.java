package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		long[] padoban = new long[101];
		padoban[1] = 1;
		padoban[2] = 1;
		
		for(int i = 3; i <= 100; i++)
		{
			padoban[i] = padoban[i - 2] + padoban[i - 3];
		}
		
		for(int i = 0; i < for_num; i++)
		{
			bw.write(padoban[Integer.parseInt(br.readLine())] + "\n");
		}
		bw.flush();
	}

}
