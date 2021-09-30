package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon9020 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			int num = Integer.parseInt(br.readLine());
			
			boolean[] is_prime = new boolean[num + 1];
			Arrays.fill(is_prime, true);
			
			is_prime[0] = false;
			is_prime[1] = false;
			
			for(int j = 2; j <= num; j++)
			{
				if(is_prime[j])
				{
					for(int k = 2 * j; k <= num; k += j)
					{
						is_prime[k] = false;
					}
				}
			}
			
			for(int j = num / 2; j >= 2; j--)
			{
				if(is_prime[j] && is_prime[num - j])
				{
					bw.write(j + " " + (num - j) + "\n");
					break;
				}
			}
		}
		bw.flush();

	}

}
