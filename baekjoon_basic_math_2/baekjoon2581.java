package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
		int sum_of_prime = 0, min = 0;
		
		for(int i = m; i <= n; i++)
		{
			boolean is_prime = true;
			if(i == 1)
			{
				is_prime = false;
			}
			else if(i == 2)
			{
			}
			else
			{
				for(int j = 2; j < i; j++)
				{
					if(i % j == 0)
					{
						is_prime = false;
						break;
					}
				}
			}
			
			if(is_prime)
			{
				sum_of_prime += i;
				if(min == 0)
				{
					min = i;
				}
			}
		}
		
		if(sum_of_prime == 0)
		{
			bw.write("-1");
		}
		else
		{			
			bw.write(sum_of_prime + "\n" + min);
		}
		bw.flush();
	}

}
