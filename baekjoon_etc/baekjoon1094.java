package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1094 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		
		for(int i = 64; n != 0; i /= 2)
		{
			result += n / i;
			
			n %= i;
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
