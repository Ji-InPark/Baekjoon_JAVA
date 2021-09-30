package baekjoon_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int star_num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= star_num; i++)
		{
			for(int j = 0; j < i; j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
