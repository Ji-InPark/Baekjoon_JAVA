package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), i = 2, differ;

		if(n == 1)
		{
			bw.write("1/1");
		}
		else
		{
			while(n > i*(i+1)/2)
			{
				i++;
			}
			differ = i*(i+1)/2 - n;
			if(i % 2 == 0)
			{
				bw.write((i - differ) + "/" + (1 + differ));								
			}
			else
			{
				bw.write((1 + differ) + "/" + (i - differ));
			}
		}
		bw.flush();
	}

}
