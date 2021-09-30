package baekjoon_1_dimension_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = 0, max = 0, index = 0;
		
		
		for(int i = 1; i <= 9; i++)
		{
			num = Integer.parseInt(br.readLine());
			if(max < num)
			{
				max = num;
				index = i;
			}
		}
		
		bw.write(max + "\n" + index);
		bw.flush();
	}

}
