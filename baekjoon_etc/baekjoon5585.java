package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon5585 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = 1000 - Integer.parseInt(br.readLine());
		int result = 0;
		int[] coins = {500, 100, 50, 10, 5, 1};
		
		for(int i = 0; i < coins.length && n != 0; i++)
		{
			result += n / coins[i];
			n %= coins[i];
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
