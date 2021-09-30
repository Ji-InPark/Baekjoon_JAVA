package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon15663 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
		
		String[] input_num = br.readLine().split(" ");
		int[] arr = new int[N];
		int[] result = new int[M];
		boolean[] select = new boolean[N];
		for(int i = 0; i < N; i++)
		{
			arr[i] = Integer.parseInt(input_num[i]);
		}
		Arrays.sort(arr);
		Arrays.fill(select, false);
		
		solve(arr, M, 0, select, result);
		bw.flush();
	}
	
	public static void solve(int[] arr, int M, int cnt, boolean[] select, int[] result) throws IOException
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
					select[i] = true;
					if(result[cnt] != arr[i])
					{
						result[cnt] = arr[i];
						solve(arr, M, cnt + 1, select, result);
					}
					select[i] = false;
				}
			}
			result[cnt] = 0;
		}
	}

}
