package baekjoon_if;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input_num = Integer.parseInt(br.readLine());
		
		if(input_num % 4 == 0)
		{
			if(input_num % 100 == 0)
			{
				if(input_num % 400 == 0)
				{
					bw.write("1");
				}
				else
				{
					bw.write("0");
				}
			}
			else
			{
				bw.write("1");
			}
		}
		else
		{
			bw.write("0");
		}
		
		bw.flush();
	}

}
