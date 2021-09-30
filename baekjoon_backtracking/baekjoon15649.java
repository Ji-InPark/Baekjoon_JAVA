package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon15649 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_num = null;
		
		try {
			input_num = br.readLine().split(" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int n = Integer.parseInt(input_num[0]);
		int m = Integer.parseInt(input_num[1]);
		
		boolean[] num_selected = new boolean[9];
		for(int i = 1; i <= 8; i++)
		{
			num_selected[i] = false;
		}
		
		int[] num_saving_array = new int[9];
		for(int i = 1; i <= 8; i++)
		{
			num_saving_array[i] = 0;
		}
		
		n_and_m(n, m, 1, num_selected, num_saving_array);
		
	}
	
	public static void n_and_m(int n, int m, int line_num, boolean[] ns, int[] nsa)
	{
		if(m == line_num)
		{
			for(int i = 1; i <= n; i++)
			{
				if(ns[i])
				{
					continue;
				}
				else
				{
					nsa[line_num] = i;
					String ts = "";
					for(int j = 1; j <= m; j++)
					{
						ts += nsa[j] + " ";
					}
					System.out.println(ts);
					nsa[line_num] = 0;
				}
			}
			return;
		}
		else
		{
			for(int i = 1; i <= n; i++)
			{
				if(ns[i])
				{
					continue;
				}
				else
				{
					nsa[line_num] = i;
					ns[i] = true;
					n_and_m(n, m, line_num + 1, ns, nsa);
					ns[i] = false;
					nsa[line_num] = 0;
				}
			}
		}
	}
}
