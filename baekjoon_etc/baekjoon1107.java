package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] check = new boolean[10];
		Arrays.fill(check, true);
		int N = Integer.parseInt(br.readLine());
		int for_num = Integer.parseInt(br.readLine());
		String input_string = br.readLine();
		if(for_num != 0)
		{
			String[] input = input_string.split(" ");
			
			for(int i = 0; i < for_num; i++)
			{
				check[Integer.parseInt(input[i])] = false;
			}
		}
		
		int result = Math.abs(N - 100);
		
		for(int i = 0; i <= 1000000; i++)
		{
			int temp = i;
			int len = find(check, temp);
			
			if(len > 0)
			{
				int press = Math.abs(temp - N);
				if(result > press + len)
					result = press + len;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
		
	}
	
	public static int find(boolean[] check, int n)
	{
		if(n == 0)
			if(!check[0])
				return 0;
			else
				return 1;
		
		int len = 0;
		
		while(n > 0)
		{
			if(!check[n % 10]) return 0;
			
			n /= 10;
			len++;
		}
		
		return len;
	}
}
