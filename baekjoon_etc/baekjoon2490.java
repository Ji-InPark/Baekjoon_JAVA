package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int a = 0; a < 3; a++)
		{
			int result = 0;
			String[] input = br.readLine().split(" ");
			
			for(int i = 0; i < input.length; i++)
			{
				result += Integer.parseInt(input[i]);
			}
			
			if(result == 0)
				bw.write("D");
			else if(result == 1)
				bw.write("C");
			else if(result == 2)
				bw.write("B");
			else if(result == 3)
				bw.write("A");
			else
				bw.write("E");
			
			bw.write("\n");
		}
		
		bw.flush();

	}

}
