package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result = 1;
		String[] input_string = br.readLine().split(" ");
		int E = Integer.parseInt(input_string[0]) - 1, S = Integer.parseInt(input_string[1]) - 1, M = Integer.parseInt(input_string[2]) - 1;
		int e = 0, s = 0, m = 0;
	
		while(e != E || s != S || m != M)
		{
			result++;
			e++;
			s++;
			m++;
			e %= 15;
			s %= 28;
			m %= 19;
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
