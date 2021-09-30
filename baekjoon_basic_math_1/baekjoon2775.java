package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		int[][] num_array = new int[15][15];
		
		for(int i = 0; i < 15; i++)
		{
			for(int j = 1; j <= 14; j++)
			{
				if(i == 0)
				{
					num_array[i][j] = j;
				}
				else
				{
					for(int k = 1; k <= j; k++)
					{
						num_array[i][j] += num_array[i-1][k];
					}
				}
			}
		}

		for(int i = 0; i < for_num; i++)
		{
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			bw.write(num_array[k][n] + "\n");
		}
		bw.flush();
	}

}
