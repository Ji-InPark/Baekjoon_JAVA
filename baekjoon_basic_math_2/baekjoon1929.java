package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_string = new String[2];
		input_string = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_string[0]), m = Integer.parseInt(input_string[1]);
		boolean[] is_prime = new boolean[m + 1];
		Arrays.fill(is_prime, true);
		
		is_prime[0] = false;
		is_prime[1] = false;
		
		for(int i = 2; i <= m; i++)
		{
			if(is_prime[i])
			{
				if(n <= i && i <= m)
				{
					bw.write(i + "\n");
				}
				
				for(int j = 2 * i; j <= m; j += i)
				{
					is_prime[j] = false;
				}
			}
		}
		bw.flush();
		
	}

}
