package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i > 1; i--)
		{
			for(int j = 0; j < N - i; j++)
			{
				bw.write(" ");
			}
			for(int j = 0; j < i * 2 - 1; j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for(int i = 1; i <= N; i++)
		{
			for(int j = 0; j < N - i; j++)
			{
				bw.write(" ");
			}
			for(int j = 0; j < i * 2 - 1; j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();

	}

}
