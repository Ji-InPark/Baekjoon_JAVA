package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()), five = 0, three = 0;
		boolean find_result = false;
		
		for(int i = 0; i <= n / 3; i++)
		{
			if((n - 3 * i) % 5 == 0)
			{
				three = i;
				five = (n - 3 * i) / 5;
				find_result = true;
				break;
			}
		}
		
		if(find_result)
		{
			bw.write(three + five + " ");
		}
		else
		{
			bw.write("-1");
		}
		bw.flush();
		
		
	}

}
