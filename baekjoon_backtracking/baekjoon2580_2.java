package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2580_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[][] input_sarray = new String[9][9];
		int[][] input_array = new int[9][9];
		int blank_nums = 0;
		
		try {
			for(int i = 0; i < 9; i++)
			{
				input_sarray[i] = br.readLine().split(" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				input_array[i][j] = Integer.parseInt(input_sarray[i][j]);
				if(input_array[i][j] == 0)
				{
					blank_nums++;
				}
			}
		}
		
		int[][] zero_positions = new int[blank_nums][2];
		int[][] zero_nums = new int[blank_nums][9];
		int temp = 0;
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				if(input_array[i][j] == 0)
				{
					Arrays.fill(zero_nums[temp], 0);
					zero_positions[temp][0] = i;
					zero_positions[temp][1] = j;
					//check_num_is_exist(input_array, i, j, temp, zero_nums);
					temp++;
				}
			}
		}
		
		solve_sudoku(input_array, zero_positions, 0, zero_nums);
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				bw.write(input_array[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
	}

	public static Boolean solve_sudoku(int[][] array, int[][] zero_positions, int num_of_call, int[][] zero_nums)
	{
		if(num_of_call == zero_positions.length)
		{
			return check_sudoku_solved(array);
		}
		else
		{
			check_num_is_exist(array, zero_positions[num_of_call][0], zero_positions[num_of_call][1], num_of_call, zero_nums);
			for(int i = 0; zero_nums[num_of_call][i] != 0; i++) 
			{
				array[zero_positions[num_of_call][0]][zero_positions[num_of_call][1]] = zero_nums[num_of_call][i];
				if(solve_sudoku(array, zero_positions, num_of_call + 1, zero_nums))
				{
					return true;
				}
				if(i >= 8)
					break;
			}
			Arrays.fill(zero_nums[num_of_call], 0);
			array[zero_positions[num_of_call][0]][zero_positions[num_of_call][1]] = 0;
			return false;
		}
	}
	
	public static Boolean check_sudoku_solved(int[][] array)
	{
		Boolean[] check_array = new Boolean[10];
		
		for(int i = 0; i < 9; i++)
		{
			Arrays.fill(check_array, false);
			for(int j = 0; j < 9; j++)
			{
				if(check_array[array[i][j]])
				{
					return false;
				}
				else
				{
					check_array[array[i][j]] = true;
				}
				
			}
			
			Arrays.fill(check_array, false);
			for(int j = 0; j < 9; j++)
			{
				if(check_array[array[j][i]])
				{
					return false;
				}
				else
				{
					check_array[array[j][i]] = true;
				}
			}
		}

		for(int a = 0; a < 9; a += 3)
		{
			for(int b = 0; b < 9; b += 3)
			{
				Arrays.fill(check_array, false);
				for(int i = 0 + a; i < 3 + a; i++)
				{
					for(int j = 0 + b; j < 3 + b; j++)
					{
						if(check_array[array[i][j]])
						{
							return false;
						}
						else
						{
							check_array[array[i][j]] = true;
						}
					}
				}
			}
		}
		
		return true;
	}
	
	public static void check_num_is_exist(int[][] array, int y, int x, int num_of_call, int[][] zero_nums)
	{
		Boolean[] exist_nums = new Boolean[10];
		Arrays.fill(exist_nums, false);
		for(int i = 0; i < 9; i++)
		{
			exist_nums[array[y][i]] = true;
			exist_nums[array[i][x]] = true;
		}
		
		int a, b;
		
		if(y < 3)
		{
			a = 0;
		}
		else if(y < 6)
		{
			a = 3;
		}
		else
		{
			a = 6;
		}
		
		if(x < 3)
		{
			b = 0;
		}
		else if(x < 6)
		{
			b = 3;
		}
		else
		{
			b = 6;
		}
		
		for(int i = 0 + a; i < 3 + a; i++)
		{
			for(int j = 0 + b; j < 3 + b; j++)
			{
				exist_nums[array[i][j]] = true;
			}
		}
		
		int temp = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(!exist_nums[i])
			{
				zero_nums[num_of_call][temp++] = i;
			}
		}
		
	}
}
