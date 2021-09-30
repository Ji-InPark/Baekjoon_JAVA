package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		if(n == 1)
		{
			
		}
		else
		{
			for(int i = 2; i <= n; i++)
			{
				if(n % i == 0)
				{
					bw.write(i + "\n");
					n /= i;
					i--;
				}
			}
			bw.flush();
		}
	}

}
