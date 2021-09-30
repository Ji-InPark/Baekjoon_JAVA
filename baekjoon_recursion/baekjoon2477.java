package baekjoon_recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2477 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				cal_output_star(n, j, i);				
			}
			bw.write("\n");
		}
		bw.flush();
	}
	
	public static void cal_output_star(int n, int xj, int yi) throws IOException
	{
		if(n == 1)
		{
			bw.write("*");
		}
		else
		{
			if(yi / (n / 3) == 1 & xj / (n / 3) == 1)
			{
				bw.write(" ");
			}
			else
			{
				cal_output_star(n / 3, xj - (xj / (n / 3)) * (n / 3), yi - (yi / (n / 3)) * (n / 3));
			}
		}
	}

}

