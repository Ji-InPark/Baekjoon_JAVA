package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon4948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true)
		{
			int n = Integer.parseInt(br.readLine()), result = 0;
			
			
			
			if(n == 0)
			{
				break;
			}
			else if(n == 1)
			{
				bw.write("1\n");
			}
			else
			{
				
				boolean[] is_prime = new boolean[2 * n + 1];
				Arrays.fill(is_prime, true);
				
				is_prime[0] = false;
				is_prime[1] = false;
				
				for(int i = 2; i <= 2 * n; i++)
				{
					if(is_prime[i])
					{
						if(n < i && i <= 2 * n)
						{
							result++;
						}
						
						for(int j = 2 * i; j <= 2 * n; j += i)
						{
							is_prime[j] = false;
						}
					}
				}
				bw.write(result + "\n");
			}
		}
		bw.flush();
	}

}
