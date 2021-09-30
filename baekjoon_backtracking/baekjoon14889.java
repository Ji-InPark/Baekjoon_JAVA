package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon14889 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input_num = new String();
		
		input_num = br.readLine();
		
		String[][] input_sarray = new String[Integer.parseInt(input_num)][Integer.parseInt(input_num)];
		for(int i = 0; i < Integer.parseInt(input_num); i++)
		{
			input_sarray[i] = br.readLine().split(" ");
		}
		
		int[][] input_array = new int[Integer.parseInt(input_num)][Integer.parseInt(input_num)];
		for(int i = 0; i < Integer.parseInt(input_num); i++)
		{
			for(int j = 0; j < Integer.parseInt(input_num); j++)
			{
				input_array[i][j] = Integer.parseInt(input_sarray[i][j]);
			}
		}
		
		int[] end_num = new int[1], min = new int[1];
		 boolean[] check_array = new boolean[Integer.parseInt(input_num) + 1];
		end_num[0] = 0;
		min[0] = 0;
		
		start_and_link(Integer.parseInt(input_num), 0, 0, end_num, min, input_array, check_array);
		
		bw.write(min[0] + "\n");
		bw.flush();
		
		
	}
	
	public static void cal_team_stats(int n, int fn, int sn, int pn, int num_of_call, int[] numbers, int[] result, int[][] array)
	{
		if(num_of_call == 2)
		{
			result[0] += array[fn - 1][sn - 1] + array[sn - 1][fn - 1];
		}
		else if(num_of_call == 1)
		{
			for(int i = pn + 1; i < n / 2; i++)
			{
				cal_team_stats(n, fn, numbers[i], i, num_of_call + 1, numbers, result, array);
			}
		}
		else
		{
			for(int i = 0; i < n / 2; i++)
			{
				cal_team_stats(n, numbers[i], 0, i, num_of_call + 1, numbers, result, array);
			}
		}
	}
	
	public static int cal_team_differ(int n, boolean[] check_array, int[][] array)
	{
		int[] nums_of_true = new int[n/2], result_of_true = new int[1];
		int[] nums_of_false = new int[n/2], result_of_false = new int[1];
		int temp_for_true = 0, temp_for_false = 0, differ;
		
		result_of_true[0] = 0;
		result_of_false[0] = 0;
		
		for(int i = 1; i <= n; i++)
		{
			if(check_array[i])
			{
				nums_of_true[temp_for_true++] = i;
			}
			else
			{
				nums_of_false[temp_for_false++] = i;
			}
		}
		
		cal_team_stats(n, 0, 0, 0, 0, nums_of_true, result_of_true, array);
		cal_team_stats(n, 0, 0, 0, 0, nums_of_false, result_of_false, array);
		
		if(result_of_true[0] > result_of_false[0])
		{
			differ = result_of_true[0] - result_of_false[0];
		}
		else
		{
			differ =  result_of_false[0] - result_of_true[0];
		}
		
		//System.out.println(differ);
		
		return differ;
	}
	
	public static boolean start_and_link(int n, int num_of_call, int pn, int[] end_num, int[] min, int[][] array, boolean[] check_array)
	{
		if(end_num[0] == cal_end_num(n))
		{
			return true;
		}
		else
		{
			if(num_of_call == n / 2)
			{
				if(end_num[0] == 0)
				{
					min[0] = cal_team_differ(n, check_array, array);
				}
				else
				{
					int result = cal_team_differ(n, check_array, array);
					if(result < min[0])
					{
						min[0] = result;
					}
				}
				end_num[0]++;
			}
			else
			{
				for(int i = pn + 1; i <= n; i++)
				{
					check_array[i] = true;
					if(start_and_link(n, num_of_call + 1, i, end_num, min, array, check_array))
					{
						return true;
					}
					check_array[i] = false;
				}
			}
		}
		
		
		return false;
	}

	public static long cal_end_num(int n)
	{
		long result = 1;
		
		for(int i = n; i > 0; i--)
		{
			if(i > n / 2)
				result = result * i;
			else
				result = result / i;
		}

		
		//System.out.println(result);
		
		return result / 2;
	}
}
