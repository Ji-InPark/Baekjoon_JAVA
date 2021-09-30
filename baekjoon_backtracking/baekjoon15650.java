package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon15650 {

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
		
		int[] num_saving_array = new int[9];
		for(int i = 1; i <= 8; i++)
		{
			num_saving_array[i] = 0;
		}
		
		n_and_m_2(n, m, 1, 1, num_saving_array);
	}
	
	public static void n_and_m_2(int n, int m, int line_num, int pn, int[] nsa)
	{
		if(m == line_num)
		{
			for(int i = pn; i <= n; i++)
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
			return;
		}
		else 
		{
			for(int i = pn; i <= n; i++)
			{
				nsa[line_num] = i;
				n_and_m_2(n, m, line_num + 1, i + 1, nsa);
				nsa[line_num] = 0;
			}
		}
	}

}
