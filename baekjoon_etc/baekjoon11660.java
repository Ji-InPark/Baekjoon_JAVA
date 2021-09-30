package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]);
		
		int[][] arr = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++)
		{
			String[] input = br.readLine().split(" ");
			
			for(int j = 1; j <= n; j++)
			{
				arr[i][j] = arr[i][j - 1] + Integer.parseInt(input[j - 1]);
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			String[] input = br.readLine().split(" ");
			int[] xy = new int[input.length];
			
			for(int j = 0; j < xy.length; j++)
			{
				xy[j] = Integer.parseInt(input[j]);
			}
			
			int result = 0;
			
			for(int j = xy[0]; j <= xy[2]; j++)
			{
				result += arr[j][xy[3]] - arr[j][xy[1] - 1];
			}
			
			bw.write(result + "\n");
		}
		bw.flush();

	}

}
