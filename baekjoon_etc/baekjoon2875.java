package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2875 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]), k = Integer.parseInt(input_nums[2]);
		
		if(n < 2 * m)
		{
			k -= m - n / 2;
			m -= m - n / 2;	
		}
		else if(n > 2 * m)
		{
			k -= n - 2 * m;
			n -= n - 2 * m;
		}
		
		if(n % 2 == 1)
		{
			k--;
			n--;
		}
		
		if(k <= 0)
		{
			bw.write(m + "\n");
		}
		else
		{
			if(k % 3 == 0) 
			{
				bw.write((m - k / 3) + "\n");
			}
			else
			{
				bw.write((m - k / 3) - 1 + "\n");
			}
		}
		
		bw.flush();
	}

}
