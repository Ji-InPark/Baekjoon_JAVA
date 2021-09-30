package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		int people = 0, result = 0;
		
		for(int i = 0; i < 4; i++)
		{
			String[] input = br.readLine().split(" ");
			
			people += Integer.parseInt(input[1]) - Integer.parseInt(input[0]);
			
			result = Math.max(result, people);
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
