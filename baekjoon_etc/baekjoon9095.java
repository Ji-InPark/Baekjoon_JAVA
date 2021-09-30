package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon9095 {

	static int result = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int for_num = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < for_num; i++)
		{
			int n = Integer.parseInt(br.readLine());
			solve(0, n);
			bw.write(result + "\n");
			result = 0;
		}
		
		bw.flush();

	}
	
	public static void solve(int cur, int goal)
	{
		if(cur > goal)
			return;
		else if(cur == goal)
		{
			result++;
			return;
		}
		else
		{
			for(int i = 1; i <= 3; i++)
			{
				solve(cur + i, goal);
			}
		}
	}
}
