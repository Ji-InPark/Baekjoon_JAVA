package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1014 {
// state: unsolved 
// need to solve it again
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < for_num; a++)
		{
			String[] input_nums = br.readLine().split(" ");
			int h = Integer.parseInt(input_nums[0]), w = Integer.parseInt(input_nums[1]);
			int[] calc = new int[w];
			boolean[] choosed = new boolean[w];
			int[][] save_array = new int[h][w];
			boolean[][] save_bool = new boolean[h][w];
			
			Arrays.fill(choosed, false);
			
			for(int i = 0; i < h; i++)
			{
				String input_string = br.readLine();
				for(int j = 0; j < w; j++)
				{
					if(input_string.charAt(j) == '.')
					{
						save_array[i][j] = 1;
						save_bool[i][j] = true;
					}
					else
					{
						save_array[i][j] = 0;
						save_bool[i][j] = false;
					}
				}
			}
			
			if(w == 1)
			{
				bw.write(get_seats(save_array, 0) + "\n");
				continue;
			}
			
			for(int i = 0; i < w; i++)
			{
				calc[i] = get_seats(save_array, i) - get_cnt(save_array, i, save_bool);
				set_bool(save_array, save_bool);
			}
			
			int ans = 0;
			
			for(int i = 0; i < w; i++)
			{
				int max = -999999, max_index = 0;
				for(int j = 0; j < w; j++)
				{
					if(calc[max_index] < calc[j] && !choosed[j])
					{
						max_index = j;
						max = calc[j];
					}
					/*
					else if(calc[max_index] == calc[j] && !choosed[j])
					{
						if(get_seats(save_array, max_index) < get_seats(save_array, j))
						{
							max_index = j;							
							max = calc[j];
						}
					}
					*/
					else if(choosed[max_index])
					{
						max_index++;
					}
				}
				ans += get_seats(save_array, max_index);
				masking(save_array, max_index);
				choosed[max_index] = true;
				
				for(int j = 0; j < w; j++)
				{
					if(!choosed[j]) 
					{
						set_bool(save_array, save_bool);
						calc[j] = get_seats(save_array, j) - get_cnt(save_array, j, save_bool);
						set_bool(save_array, save_bool);
						//System.out.printf("calc[%d] : %d - %d = %d | ", j, get_seats(save_array, j), get_cnt(save_array, j, save_bool), calc[j]);	
					}
				}
				
				//System.out.println("\nmax_index : " + max_index);
				//System.out.println("seats : " + get_seats(save_array, max_index));
			}
			 
			bw.write(ans + "\n");
			//System.out.println(ans + "\n");
		}
		bw.flush();
	}
	
	private static void set_bool(int[][] save_array, boolean[][] save_bool)
	{
		for(int i = 0; i < save_array.length; i++)
		{
			for(int j = 0; j < save_array[0].length; j++)
			{
				save_bool[i][j] = true;
			}
		}
	}
	
	private static int get_seats(int[][] save_array, int index)
	{
		int seats = 0;
		for(int j = 0; j < save_array.length; j++)
		{
			if(save_array[j][index] == 1)
				seats++;
		}
		
		return seats;
	}
	
	private static void masking(int[][] save_array, int index)
	{
		if(save_array.length == 1)
		{
			if (save_array[0][index] == 1)
			{
				if(index == save_array[0].length - 1)
				{
					save_array[0][index - 1] = 0;
				}
				else if (index == 0)
				{
					save_array[0][index + 1] = 0;
				}
				else
				{
					save_array[0][index - 1] = 0;
					save_array[0][index + 1] = 0;
				}
			}
		}
		else
		{
			for(int j = 0; j < save_array.length; j++)
			{
				if (save_array[j][index] == 1) 
				{
					if (j == save_array.length - 1) 
					{
						if(index == save_array[0].length - 1)
						{
							save_array[j - 1][index - 1] = 0;
							save_array[j][index - 1] = 0;
						}
						else if (index == 0)
						{
							save_array[j - 1][index + 1] = 0;
							save_array[j][index + 1] = 0;
						}
						else
						{
							save_array[j - 1][index - 1] = 0;
							save_array[j - 1][index + 1] = 0;
							save_array[j][index - 1] = 0;
							save_array[j][index + 1] = 0;
						}
					} 
					else if(j == 0) 
					{
						if(index == save_array[0].length - 1)
						{
							save_array[j][index - 1] = 0;
							save_array[j + 1][index - 1] = 0;
						}
						else if (index == 0)
						{
							save_array[j][index + 1] = 0;
							save_array[j + 1][index + 1] = 0;
						}
						else
						{
							save_array[j][index - 1] = 0;
							save_array[j][index + 1] = 0;
							save_array[j + 1][index - 1] = 0;
							save_array[j + 1][index + 1] = 0;
						}
					}
					else
					{
						if(index == save_array[0].length - 1)
						{
							save_array[j - 1][index - 1] = 0;
							save_array[j][index - 1] = 0;
							save_array[j + 1][index - 1] = 0;
						}
						else if (index == 0)
						{
							save_array[j - 1][index + 1] = 0;
							save_array[j][index + 1] = 0;
							save_array[j + 1][index + 1] = 0;
						}
						else
						{
							save_array[j - 1][index - 1] = 0;
							save_array[j - 1][index + 1] = 0;
							save_array[j][index - 1] = 0;
							save_array[j][index + 1] = 0;
							save_array[j + 1][index - 1] = 0;
							save_array[j + 1][index + 1] = 0;
						}
					}
				}

			}

		}
		
		
	}

	private static int get_cnt(int[][] save_array, int index, boolean[][] save_bool) {
		
		int cnt = 0;
		
		if(save_array.length == 1)
		{
			if (save_array[0][index] == 1)
			{
				if(index == save_array[0].length - 1)
				{
					if(save_array[0][index - 1] == 1)
					{
						cnt++;
					}
				}
				else if (index == 0)
				{
					if(save_array[0][index + 1] == 1)
					{
						cnt++;
					}
				}
				else
				{
					if(save_array[0][index - 1] == 1)
					{
						cnt++;
					}
					if(save_array[0][index + 1] == 1)
					{
						cnt++;
					}
				}
			}
			return cnt;
		}
		
		for(int j = 0; j < save_array.length; j++)
		{
			if (save_array[j][index] == 1) 
			{
				if (j == save_array.length - 1) 
				{
					if(index == save_array[0].length - 1)
					{
						if(save_array[j][index - 1] == 1 && save_bool[j][index - 1])
						{
							cnt++;
							save_bool[j][index - 1] = false;
						}
						if(save_array[j - 1][index - 1] == 1 && save_bool[j - 1][index - 1])
						{
							cnt++;
							save_bool[j - 1][index - 1] = false;
						}
					}
					else if (index == 0)
					{
						if(save_array[j][index + 1] == 1 && save_bool[j][index + 1])
						{
							cnt++;
							save_bool[j][index + 1] = false;
						}
						if(save_array[j - 1][index + 1] == 1 && save_bool[j - 1][index + 1])
						{
							cnt++;
							save_bool[j - 1][index + 1] = false;
						}
					}
					else
					{
						if(save_array[j][index + 1] == 1 && save_bool[j][index + 1])
						{
							cnt++;
							save_bool[j][index + 1] = false;
						}
						if(save_array[j][index - 1] == 1 && save_bool[j][index - 1])
						{
							cnt++;
							save_bool[j][index - 1] = false;
						}
						if(save_array[j - 1][index + 1] == 1 && save_bool[j - 1][index + 1])
						{
							cnt++;
							save_bool[j - 1][index + 1] = false; 
						}
						if(save_array[j - 1][index - 1] == 1 && save_bool[j - 1][index - 1])
						{
							cnt++;
							save_bool[j - 1][index - 1] = false;
						}
					}
				} 
				else if(j == 0)
				{
					if(index == save_array[0].length - 1)
					{
						if(save_array[j][index - 1] == 1 && save_bool[j][index - 1])
						{
							cnt++;
							save_bool[j][index - 1] = false;
						}
						if(save_array[j + 1][index - 1] == 1 && save_bool[j + 1][index - 1])
						{
							cnt++;
							save_bool[j + 1][index - 1] = false;
						}
					}
					else if (index == 0)
					{
						if(save_array[j][index + 1] == 1 && save_bool[j][index + 1])
						{
							cnt++;
							save_bool[j][index + 1] = false;
						}
						if(save_array[j + 1][index + 1] == 1 && save_bool[j + 1][index + 1])
						{
							cnt++;
							save_bool[j + 1][index + 1] = false;
						}
					}
					else
					{
						if(save_array[j][index - 1] == 1 && save_bool[j][index - 1])
						{
							cnt++;
							save_bool[j][index - 1] = false;
						}
						if(save_array[j + 1][index - 1] == 1 && save_bool[j + 1][index - 1])
						{
							cnt++;
							save_bool[j + 1][index - 1] = false;
						}
						if(save_array[j][index + 1] == 1 && save_bool[j][index + 1])
						{
							cnt++;
							save_bool[j][index + 1] = false;
						}
						if(save_array[j + 1][index + 1] == 1 && save_bool[j + 1][index + 1])
						{
							cnt++;
							save_bool[j + 1][index + 1] = false;
						}
					}
				}
				else
				{
					if(index == save_array[0].length - 1)
					{
						if(save_array[j - 1][index - 1] == 1 && save_bool[j - 1][index - 1])
						{
							cnt++;
							save_bool[j - 1][index - 1] = false;
						}
						if(save_array[j][index - 1] == 1 && save_bool[j][index - 1])
						{
							cnt++;
							save_bool[j][index - 1] = false;
						}
						if(save_array[j + 1][index - 1] == 1 && save_bool[j + 1][index - 1])
						{
							cnt++;
							save_bool[j + 1][index - 1] = false;
						}
					}
					else if (index == 0)
					{
						if(save_array[j - 1][index + 1] == 1 && save_bool[j - 1][index + 1])
						{
							cnt++;
							save_bool[j - 1][index + 1] = false;
						}
						if(save_array[j][index + 1] == 1 && save_bool[j][index + 1])
						{
							cnt++;
							save_bool[j][index + 1] = false;
						}
						if(save_array[j + 1][index + 1] == 1 && save_bool[j + 1][index + 1])
						{
							cnt++;
							save_bool[j + 1][index + 1] = false;
						}
					}
					else
					{
						if(save_array[j - 1][index - 1] == 1 && save_bool[j - 1][index - 1])
						{
							cnt++;
							save_bool[j - 1][index - 1] = false;
						}
						if(save_array[j][index - 1] == 1 && save_bool[j][index - 1])
						{
							cnt++;
							save_bool[j][index - 1] = false;
						}
						if(save_array[j + 1][index - 1] == 1 && save_bool[j + 1][index - 1])
						{
							cnt++;
							save_bool[j + 1][index - 1] = false;
						}
						if(save_array[j - 1][index + 1] == 1 && save_bool[j - 1][index + 1])
						{
							cnt++;
							save_bool[j - 1][index + 1] = false;
						}
						if(save_array[j][index + 1] == 1 && save_bool[j][index + 1])
						{
							cnt++;
							save_bool[j][index + 1] = false;
						}
						if(save_array[j + 1][index + 1] == 1 && save_bool[j + 1][index + 1])
						{
							cnt++;
							save_bool[j + 1][index + 1] = false;
						}
					}
				}
			}

		}
		
		//System.out.println("cnt : " + cnt);
		
		return cnt;
	}
	
}
