package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]);
		
		int six = n / 6, one = n % 6;
		
		int[] six_arr = new int[m], one_arr = new int[m];
		int six_min = Integer.MAX_VALUE, one_min = Integer.MAX_VALUE;
		
		for(int i = 0; i < m; i++)
		{
			String[] input = br.readLine().split(" ");
			
			if(six_min  > Integer.parseInt(input[0]))
				six_min = Integer.parseInt(input[0]);
			
			if(one_min > Integer.parseInt(input[1]))
				one_min = Integer.parseInt(input[1]);
		}
		int result;
		
		if(six_min >= one_min * 6)
		{
			result = one_min * n;
		}
		else
		{
			if(six_min < one_min * one)
			{
				result = six_min * (six + 1);
			}
			else
			{
				result = six_min * six + one_min * one;
			}
		}
		
		
		bw.write(result + "\n");
		bw.flush();

	}

}
