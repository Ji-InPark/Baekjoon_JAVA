package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon1904 {

public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input_num = Integer.parseInt(br.readLine());
		
		
		if(input_num == 1)
		{
			bw.write("1");
		}
		else if(input_num == 2)
		{
			bw.write("2");
		}
		else
		{
			int[] dp = new int[input_num + 1];
			
			dp[1] = 1;
			dp[2] = 2;
			
			for(int i = 3; i <= input_num; i++)
			{
				dp[i] = dp[i - 2] + dp[i - 1];
				dp[i] %= 15746;
			}
			bw.write(dp[input_num] + "");
		}
		bw.flush();

	}

}
