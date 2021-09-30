package baekjoon_backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon15651 {

	public static void main(String[] args) throws IOException {
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
		
		n_and_m_3(n, m, 1, "");
	}
	
	public static void n_and_m_3(int n, int m, int line_num, String ps) throws IOException
	{
		if(m == line_num)
		{
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
			for(int i = 1; i <= n; i++)
			{
				bw.write(ps + i + "\n");
			}
			bw.flush();
			return;
		}
		else 
		{
			for(int i = 1; i <= n; i++)
			{
				n_and_m_3(n, m, line_num + 1, ps + i + " ");
			}
		}
	}
}
