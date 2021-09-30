package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int result = 0;
		
		for(int i = 0; i < input.length; i++)
		{
			int temp = Integer.parseInt(input[i]);
			result += temp * temp;
		}
		
		bw.write(result % 10 + "\n");
		bw.flush();

	}

}
