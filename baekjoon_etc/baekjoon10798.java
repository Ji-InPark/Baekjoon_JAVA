package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] arr = new char[5][15];
		
		for(int i = 0; i < 5; i++)
		{
			Arrays.fill(arr[i], '-');
			
			String input = br.readLine();
			
			for(int j = 0; j < input.length(); j++)
			{
				arr[i][j] = input.charAt(j);
			}
		}
		
		StringBuffer sb = new StringBuffer("");
		
		for(int i = 0; i < 15; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(arr[j][i] != '-')
					sb.append(arr[j][i]);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();

	}

}
