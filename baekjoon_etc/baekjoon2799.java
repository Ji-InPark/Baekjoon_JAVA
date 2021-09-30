package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		int m = Integer.parseInt(input_nums[0]), n = Integer.parseInt(input_nums[1]);
		
		int[] result = new int[5];
		
		br.readLine();
		
		for(int i = 0; i < m; i++)
		{
			int[] blinds = new int[n];
			
			for(int j = 0; j < 4; j++)
			{
				String[] input = br.readLine().split("#");
				
				for(int k = 0; k < n; k++)
				{
					if(input[k + 1].contains("*"))
					{
						blinds[k]++;
					}
				}
			}
			
			br.readLine();
			
			for(int k = 0; k < n; k++)
			{
				result[blinds[k]]++;
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			bw.write(result[i] + " ");
		}
		bw.flush();

	}

}
