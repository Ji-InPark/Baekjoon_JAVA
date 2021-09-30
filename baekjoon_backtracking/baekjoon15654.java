package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon15654 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
		
		String[] input_num = br.readLine().split(" ");
		int[] arr = new int[N];
		boolean[] select = new boolean[N];
		int[] result = new int[M];
		for(int i = 0; i < N; i++)
		{
			arr[i] = Integer.parseInt(input_num[i]);
		}
		Arrays.fill(select, false);
		Arrays.sort(arr);
		
		solve(arr, select, M, 0, result);
		bw.flush();
	}
	
	public static void solve(int[] arr, boolean[] select, int M, int cnt, int[] result) throws IOException
	{
		if(M == cnt)
		{
			for(int i = 0; i < M; i++)
			{
				bw.write(result[i] + " ");
			}
			bw.write("\n");
		}
		else
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(!select[i])
				{
					result[cnt] = arr[i];
					select[i] = true;
					solve(arr, select, M, cnt + 1, result);
					select[i] = false;
				}
			}
		}
	}

}
