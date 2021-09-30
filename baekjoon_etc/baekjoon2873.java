package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2873 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int row = Integer.parseInt(input[0]), col = Integer.parseInt(input[1]);
		
		String[][] arr = new String[row][col];
		for(int i = 0; i < row; i++)
		{
			arr[i] = br.readLine().split(" ");
		}
		
		if(row % 2 != 0)
		{
			for(int i = 0; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					if(j == col - 1 && i != row - 1)
					{
						bw.write("D");
					}
					else if(j == col - 1 && i == row - 1)
					{
						
					}
					else
					{
						if(i % 2 == 0)
						{
							bw.write("R");
						}
						else
						{
							bw.write("L");
						}
					}
				}
			}
		}
		else if(col % 2 != 0)
		{
			for(int i = 0; i < col; i++)
			{
				for(int j = 0; j < row; j++)
				{
					if(j == row - 1 && i != col - 1)
					{
						bw.write("R");
					}
					else if(j == row - 1 && i == col - 1)
					{
						
					}
					else
					{
						if(i % 2 == 0)
						{
							bw.write("D");
						}
						else
						{
							bw.write("U");
						}
					}
				}
			}
		}
		else
		{
			pair min_pair = new pair(0,0);
			int min = Integer.MAX_VALUE;
			
			for(int y = 0; y < row; y++)
			{
				for(int x = 0; x < col; x++)
				{
					if((y + x) % 2 == 1 && min > Integer.parseInt(arr[y][x]))
					{
						min_pair.set_pair(x, y);
						min = Integer.parseInt(arr[y][x]);
					}
				}
			}
			
			int new_row = min_pair.y % 2 == 1? min_pair.y - 1 : min_pair.y;
			for(int y = 0; y < new_row; y++)
			{
				for(int x = 0; x < col - 1; x++)
				{
					if(y % 2 == 0)
						bw.write("R");
					else
						bw.write("L");
				}
				bw.write("D");
			}
			
			int new_col = min_pair.x;
			for(int x = 0; x < new_col; x++)
			{
				if(x % 2 == 0)
					bw.write("DR");
				else
					bw.write("UR");
			}
			
			for(int x = new_col; x < col - 1; x++)
			{
				if(x % 2 == 0)
					bw.write("RD");
				else
					bw.write("RU");
			}
			
			if(min_pair.y % 2 == 0)
				new_row = row - (min_pair.y + 2);
			else
				new_row = row - (min_pair.y + 1);
			
			   for (int y = 0; y < new_row; y++)

               {

                       bw.write("D");

                       for (int x = 0; x < col - 1; x++)

                               if (y % 2 == 0)

									bw.write("L");

                               else
									bw.write("R");
               }

		}
		bw.flush();
	}

}

class pair
{
	public int x, y;
	
	public pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void set_pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}