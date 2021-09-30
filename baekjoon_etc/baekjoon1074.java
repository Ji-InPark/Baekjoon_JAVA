package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1074 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]), r = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]);
		
		int start_c = 0, start_r = 0;
		
		long result = 0;
		
		while(n != 0)
		{
			int temp_c = 0, temp_r = 0;
			
			if(r >= start_r + Math.pow(2, n - 1))
			{
				temp_r = 1;
				start_r += Math.pow(2, n - 1);
			}
			if(c >= start_c + Math.pow(2, n - 1))
			{
				temp_c = 1;
				start_c += Math.pow(2, n - 1);
			}
			
			result += (temp_c + temp_r * 2) * Math.pow(2, n - 1) * Math.pow(2, n - 1);
			
			n -= 1;
		}
		
		bw.write(result + "\n");
		bw.flush();
		
		

	}

}
