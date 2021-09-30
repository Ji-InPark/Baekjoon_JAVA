package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1043 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] know_truth = new boolean[55];
		
		String[] input_nums = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]);
		
		String[] arr = new String[m];
		
		String[] truth_nums = br.readLine().split(" ");
		
		for(int i = 1; i < truth_nums.length; i++)
		{
			know_truth[Integer.parseInt(truth_nums[i])] = true;
		}
		
		for(int i = 0; i < m; i++)
		{
			arr[i] = br.readLine();
			String[] input = arr[i].split(" ");
			boolean flag = false;
			
			for(int j = 1; j < input.length; j++)
			{
				if(know_truth[Integer.parseInt(input[j])])
				{
					flag = true;
					break;
				}
			}
			
			if(flag)
			{
				for(int j = 1; j < input.length; j++)
				{
					know_truth[Integer.parseInt(input[j])] = true;
				}				
			}
			
		}
		
		for(int a = 0; a < 50; a++)
		{
			for(int i = 0; i < m; i++)
			{
				String[] input = arr[i].split(" ");
				boolean flag = false;
				
				for(int j = 1; j < input.length; j++)
				{
					if(know_truth[Integer.parseInt(input[j])])
					{
						flag = true;
						break;
					}
				}
				
				if(flag)
				{
					for(int j = 1; j < input.length; j++)
					{
						know_truth[Integer.parseInt(input[j])] = true;
					}				
				}
				
			}
		}
		
		int result = 0;
		
		for(int i = 0; i < m; i++)
		{
			String[] input = arr[i].split(" ");
			boolean flag = true;
			
			for(int j = 1; j < input.length; j++)
			{
				if(know_truth[Integer.parseInt(input[j])])
				{
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
				result++;				
			}
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
