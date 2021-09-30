package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int for_num = Integer.parseInt(input[0]), n = Integer.parseInt(input[1]);
		
		int[] coins = new int[for_num];
		
		for(int i = 0; i < for_num; i++)
		{
			coins[for_num - i - 1] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		
		for(int i = 0; i < for_num && n != 0; i++)
		{
			result += n / coins[i];
			n %= coins[i];
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
