package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		int[] arr = new int[for_num + 5];
		int sum = 0, max = Integer.parseInt(input[0]), all_minus_max = max;
		
		boolean is_all_minus = true;
		
		for(int i = 0; i < for_num; i++)
		{
			arr[i] = Integer.parseInt(input[i]);
			if(arr[i] < 0)
			{
				sum += arr[i];
				if(sum < 0)
				{
					sum = 0;
				}
			}
			else
			{
				is_all_minus = false;
				sum += arr[i];
			}
			max = Math.max(sum, max);
			all_minus_max = Math.max(all_minus_max, arr[i]);
		}
		if(is_all_minus)
		{
			bw.write(all_minus_max + "\n");
		}
		else
		{			
			bw.write(max + "\n");
		}
		bw.flush();
	}

}
