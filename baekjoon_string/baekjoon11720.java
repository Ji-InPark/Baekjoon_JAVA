package baekjoon_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine()), result = 0;
		String input_string = br.readLine();
		
		for(int i = 0; i < for_num; i++)
		{
			result += input_string.charAt(i) - 48;
		}
		
		bw.write(result + " ");
		bw.flush();

	}

}
