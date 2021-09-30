package baekjoon_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] height_and_width = new String[2];
		height_and_width = br.readLine().split(" ");
		int height = Integer.parseInt(height_and_width[0]), width = Integer.parseInt(height_and_width[1]);
		final int black = 66, white = 87;
		int[][] input_array = new int[height][width];
		int min = 64;
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				input_array[i][j] = br.read();
			}
			br.readLine();
		}
		
		for(int i = 0; i < height - 7; i++)
		{
			for(int j = 0; j < width - 7; j++)
			{
				
				
				for(int k = 0; k < 2; k++)
				{
					int first, second, temp_result = 0;
					if(k == 0)
					{
						first = black;
						second = white;
					}
					else
					{
						first = white;
						second = black;	
					}
					
					for(int a = 0; a < 8; a++)
					{
						for(int b = 0; b < 8; b++)
						{
							if(a % 2 == 0)
							{
								if(b % 2 == 0)
								{
									if(input_array[a + i][b + j] != first)
									{
										temp_result++;
									}
								}
								else
								{
									if(input_array[a + i][b + j] != second)
									{
										temp_result++;
									}
								}
							}
							else
							{
								if(b % 2 == 0)
								{
									if(input_array[a + i][b + j] != second)
									{
										temp_result++;
									}
								}
								else
								{
									if(input_array[a + i][b + j] != first)
									{
										temp_result++;
									}
								}
							}
						}
					}
					
					if(min > temp_result)
					{
						min = temp_result;
					}
				}
				
				
			}
		}
		
		bw.write(min + "");
		bw.flush();
		
	}

}
