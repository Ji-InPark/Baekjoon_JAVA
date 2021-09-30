package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			String input_ox = br.readLine();
			int result = 0, temp = 1;
			for(int j = 0; j < input_ox.length(); j++)
			{
				if(input_ox.charAt(j) == 'O')
				{
					result += temp++;
				}
				else
				{
					temp = 1;
				}
			}
			bw.write(result + "\n");
		}
		bw.flush();
		
	}

}
