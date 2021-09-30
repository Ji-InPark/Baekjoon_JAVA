package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon2580 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[][] input_sarray = new String[9][9];
		int[][] input_array = new int[9][9];
		ArrayList<Integer> queue_x = new ArrayList<>();
		ArrayList<Integer> queue_y = new ArrayList<>();
		
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
					queue_x.add(j);
					queue_y.add(i);
				}
			}
		}
		
		solve_sudoku(input_array, queue_x, queue_y);
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				bw.write(input_array[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		
		int[][] save_zero_nums = new int[queue_x.size()][9];
		for(int i = 0; i < queue_x.size(); i++)
		{
			Arrays.fill(save_zero_nums[i], 0);
		}
		
		backtracking_sudoku(input_array, queue_x, queue_y, 0, save_zero_nums);
		
		/*
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				bw.write(input_array[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		*/
		bw.write("\n");
		for(int i = 0; i < queue_x.size(); i++)
		{
			bw.write((i + 1) + "\t| ");
			for(int j = 0; save_zero_nums[i][j] != 0; j++)
			{
				bw.write(save_zero_nums[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
	}
	
	public static void solve_sudoku(int[][] array, ArrayList<Integer> queue_x, ArrayList<Integer> queue_y)
	{
		Boolean is_all_solved = false;

		do
		{
			is_all_solved = false;
			for(int i = 0; i < queue_x.size(); i++)
			{
				int x = queue_x.get(i);
				int y = queue_y.get(i);
				if(solve_cline(array, x, y) || solve_rline(array, x, y) || solve_cell(array, x, y))
				{
					is_all_solved = true;
					queue_x.remove(i);
					queue_y.remove(i);
					i--;
				}
			}
		}while(is_all_solved);
	}
	
	public static Boolean backtracking_sudoku(int[][] array, ArrayList<Integer> queue_x, ArrayList<Integer> queue_y, int num_of_call, int[][] save_zero_nums)
	{
		int  x = 0, y = 0;

		if(queue_x.size() == num_of_call)
		{
			//return check_sudoku_solved(array);
			return true;
		}
		else if(save_zero_nums[num_of_call][0] != 0)
		{
			x = queue_x.get(num_of_call);
			y = queue_y.get(num_of_call);
			
			for(int i = 0; save_zero_nums[num_of_call][i] != 0; i++)
			{
				if(backtracking_sudoku(array, queue_x, queue_y, num_of_call + 1, save_zero_nums))
				{
					return true;
				}
				array[y][x] = save_zero_nums[num_of_call][i];
				System.out.printf("is_not_Empty\t (x: %d, y: %d)\t save_zero_nums[num_of_call: %d][i: %d] => %d\n", x, y, num_of_call, i, save_zero_nums[num_of_call][i]);
			}
			if(backtracking_sudoku(array, queue_x, queue_y, num_of_call + 1, save_zero_nums))
			{
				return true;
			}
			return false;
		}
		else
		{
			int crc = 0, fre_zero = 0, temp = 0;
			int[][] zero_nums = new int[3][9];
			for(int i = 0; i < 3; i++)
			{
				Arrays.fill(zero_nums[i], 0);
			}
			
			x = queue_x.get(num_of_call);
			y = queue_y.get(num_of_call);
			
			fre_zero = backtracking_cline(array, x, y, zero_nums);
			temp = backtracking_rline(array, x, y, zero_nums);
			if(temp < fre_zero)
			{
				fre_zero = temp;
				crc = 1;
			}
			temp = backtracking_cell(array, x, y, zero_nums);
			if(temp < fre_zero)
			{
				crc = 2;
				fre_zero = temp;
			}
			
			for(int i = 0; i < fre_zero; i++)
			{
				save_zero_nums[num_of_call][i] = zero_nums[crc][i]; 
			}
			
			
			for(int i = 0; i < fre_zero; i++)
			{
				if(backtracking_sudoku(array, queue_x, queue_y, num_of_call + 1, save_zero_nums))
				{
					return true;
				}
				array[y][x] = zero_nums[crc][i];
				save_zero_nums[num_of_call][i] = zero_nums[crc][i]; 
				System.out.printf("is_not_Empty\t (x: %d, y: %d)\t fre_zero: %d\t zero_nums[crc: %d][i: %d] => %d\n", x, y, fre_zero, crc, i, zero_nums[crc][i]);
			}
			if(backtracking_sudoku(array, queue_x, queue_y, num_of_call + 1, save_zero_nums))
			{
				return true;
			}
			return false;
		}
	} 
	
	public static Boolean check_sudoku_solved(int[][] array)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
		
		for(int i = 0; i < 9; i++)
		{
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
		}
		
		Arrays.fill(check_array, false);
		
		for(int i = 0; i < 9; i++)
		{
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
		
		Arrays.fill(check_array, false);
		for(int a = 0; a < 9; a += 3)
		{
			for(int b = 0; b < 9; b += 3)
			{
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
	
	public static Boolean solve_cline(int[][] array, int x, int y)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
		int fre_zero = 0, index = 0;
		for(int i = 0; i < 9; i++)
		{
			check_array[array[y][i]] = true;
			if(array[y][i] == 0) 
			{
				fre_zero++;
				index = i;
			}
		}
		
		if(fre_zero == 1)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(check_array[j] == false)
				{
					array[y][index] = j;
					System.out.printf("cline\t (x: %d, y: %d) -- answer: %d\n", x, y, j);
					return true;
				}
			}
		}
		
		return false;

	}
	
	public static int backtracking_cline(int[][] array, int x, int y, int[][] zero_nums)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
		int fre_zero = 0;
		for(int i = 0; i < 9; i++)
		{
			check_array[array[y][i]] = true;
			if(array[y][i] == 0) 
			{
				fre_zero++;
			}
		}
		
		fre_zero = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(!check_array[i]) 
			{
				zero_nums[0][fre_zero++] = i;	
			}
		}
		
		return fre_zero;
	}
	
	public static Boolean solve_rline(int[][] array, int x, int y)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
		int fre_zero = 0, index = 0;
		for(int i = 0; i < 9; i++)
		{
			check_array[array[i][x]] = true;
			if(array[i][x] == 0) 
			{
				fre_zero++;
				index = i;
			}
		}
		
		if(fre_zero == 1)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(check_array[j] == false)
				{
					array[index][x] = j;
					System.out.printf("rline\t (x: %d, y: %d) -- answer: %d\n", x, y, j);
					return true;
				}
			}
		}

		return false;
	}
	
	public static int backtracking_rline(int[][] array, int x, int y, int[][] zero_nums)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
		int fre_zero = 0;
		for(int i = 0; i < 9; i++)
		{
			check_array[array[i][x]] = true;
			if(array[i][x] == 0) 
			{
				fre_zero++;
			}
		}
		
		fre_zero = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(!check_array[i]) 
			{
				zero_nums[1][fre_zero++] = i;	
			}
		}
		
		return fre_zero;
	}
	
	
	public static Boolean solve_cell(int[][] array, int x, int y)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
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
		
		int fre_zero = 0;
		int index_zero_i = 0;
		int index_zero_j = 0;
		for(int i = 0 + a; i < 3 + a; i++)
		{
			for(int j = 0 + b; j < 3 + b; j++)
			{
				check_array[array[i][j]] = true;
				if(array[i][j] == 0) 
				{
					fre_zero++;
					index_zero_i = i;
					index_zero_j = j;					
				}
			}
		}
		
		
		if(fre_zero == 1)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(check_array[j] == false)
				{
					array[index_zero_i][index_zero_j] = j;
					System.out.printf("cell\t (x: %d, y: %d) -- answer: %d\n", x, y, j);
					return true;
				}
			}
		}

		return false;
	}
	
	public static int backtracking_cell(int[][] array, int x, int y, int[][] zero_nums)
	{
		Boolean[] check_array = new Boolean[10];
		Arrays.fill(check_array, false);
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
		
		int fre_zero = 0;
		for(int i = 0 + a; i < 3 + a; i++)
		{
			for(int j = 0 + b; j < 3 + b; j++)
			{
				check_array[array[i][j]] = true;
				if(array[i][j] == 0) 
				{
					fre_zero++;				
				}
			}
		}
		
		
		fre_zero = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(!check_array[i]) 
			{
				zero_nums[2][fre_zero++] = i;	
			}
		}
		return fre_zero;
	}
}

