package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1120 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int result = 55;
		
		for(int i = 0; i <= input[1].length() - input[0].length(); i++) 
		{
			int diff = 0;
			
			for(int j = 0; j < input[0].length(); j++)
			{
				if(input[0].charAt(j) != input[1].charAt(i + j))
				{
					diff++;
				}
			}
			
			result = Math.min(result, diff);
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
