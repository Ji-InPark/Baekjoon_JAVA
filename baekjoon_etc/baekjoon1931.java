package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class baekjoon1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] input = new int[n][2];
		
		for(int i = 0; i < n; i++)
		{
			String[] input_nums = br.readLine().split(" ");
			
			input[i][0] = Integer.parseInt(input_nums[0]);
			input[i][1] = Integer.parseInt(input_nums[1]);
		}
		
		Arrays.sort(input, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}
			
		});
		
		int result = 0, pre = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(pre <= input[i][0])
			{
				pre = input[i][1];
				result++;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
