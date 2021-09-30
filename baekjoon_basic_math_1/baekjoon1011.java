package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_string = new String[2];
			int x, y, fre_num = 1, k = 0;
			long index_for_break = 0;
			boolean flag = false;
			input_string = br.readLine().split(" ");
			
			x = Integer.parseInt(input_string[0]);
			y = Integer.parseInt(input_string[1]);
			
			while(index_for_break < y - x)
			{
				if(flag)
				{
					index_for_break += fre_num++;
					flag = false;
				}
				else
				{
					index_for_break += fre_num;
					flag = true;
				}
				k++;
				//System.out.printf("k: %d, index_for_break: %d\n", k, index_for_break);
			}
			bw.write(k + "\n");
		}
		bw.flush();
	}
	
}
