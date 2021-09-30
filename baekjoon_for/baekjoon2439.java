package baekjoon_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int star_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < star_num; i++)
		{
			for(int j = 0; j < star_num; j++)
			{
				if(j >= star_num - i - 1)
				{
					bw.write("*");
				}
				else
				{
					bw.write(" ");
				}
			}
			bw.write("\n");
		}
		bw.flush();

	}

}
