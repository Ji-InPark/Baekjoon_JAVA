package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon14888 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[][] input_sarray = new String[3][11];
		try {
			for(int i = 0; i < 3; i++)
			{
				input_sarray[i] = br.readLine().split(" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int n = Integer.parseInt(input_sarray[0][0]);
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++)
		{
			numbers[i] = Integer.parseInt(input_sarray[1][i]);
		}
		int[] operator = new int[4];
		for(int i = 0; i < 4; i++)
		{
			operator[i] = Integer.parseInt(input_sarray[2][i]);
		}

		int[] max_min = new int[2];
		int result = 0;
		boolean[] initialize = new boolean[1];
		
		process(operator, numbers, n, 0, max_min, result, initialize);
		
		bw.write(max_min[0] + "\n" + max_min[1]);
		bw.flush();
	}
	
	public static void process(int[] operator, int[] numbers, int n, int num_of_call, int[] max_min, int result, boolean[] initialize)
	{
		if(num_of_call == n)
		{
			if(!initialize[0]) 
			{
				max_min[0] = result;
				max_min[1] = result;
				initialize[0] = true;
			}
			else
			{
				if(result > max_min[0])
					max_min[0] = result;
				if(result < max_min[1])
					max_min[1] = result;
				
			}
		}
		else if(num_of_call == 0)
		{
			result = numbers[num_of_call];
			process(operator, numbers, n, num_of_call + 1, max_min, result, initialize);
		}
		else
		{
			if(operator[0] > 0)
			{
				operator[0]--;
				process(operator, numbers, n, num_of_call + 1, max_min, result + numbers[num_of_call], initialize);
				operator[0]++;
			}
			if(operator[1] > 0)
			{
				operator[1]--;
				process(operator, numbers, n, num_of_call + 1, max_min, result - numbers[num_of_call], initialize);
				operator[1]++;
			}
			if(operator[2] > 0)
			{
				operator[2]--;
				process(operator, numbers, n, num_of_call + 1, max_min, result * numbers[num_of_call], initialize);
				operator[2]++;
			}
			if(operator[3] > 0)
			{
				operator[3]--;
				process(operator, numbers, n, num_of_call + 1, max_min, result / numbers[num_of_call], initialize);
				operator[3]++;
			}
		}
	}
}
