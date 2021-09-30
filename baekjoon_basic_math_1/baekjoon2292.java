package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), temp = 1, i = 2;
		
		if(n == 1)
		{
			bw.write("1");
		}
		else
		{
			while(6 * temp + 1 < n)
			{
				temp += i++;
			}
			bw.write(i + " ");
		}
		bw.flush();
	}

}
