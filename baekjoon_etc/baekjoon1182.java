package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1182 {
	
	static int result = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]), s = Integer.parseInt(input[1]);
		
		String[] input_nums = br.readLine().split(" ");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(input_nums[i]);
		}
		
		solve(s, 0, arr, 0, n);
		
		if(s == 0)
			result--;
		
		bw.write(result + "\n");
		bw.flush();

	}
	
	public static void solve(int s, int now, int[] arr, int index, int end)
	{
		
		if(index == end)
		{
			if(s == now)
				result++;
			return;
		}
		
		solve(s, now + arr[index], arr, index + 1, end);
		solve(s, now, arr, index + 1, end);
	}

}
