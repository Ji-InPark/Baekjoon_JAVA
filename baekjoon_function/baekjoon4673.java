package baekjoon_function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon4673 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] is_self_number = new boolean[10000];
		Arrays.fill(is_self_number, true);
		
		for(int i = 1; i < 10000; i++)
		{
			int temp = d(i);
			if(temp < 10000)
				is_self_number[temp] = false;
		}
		
		for(int i = 1; i < 10000; i++)
		{
			if(is_self_number[i])
			{
				bw.write(i + "\n");
			}
		}
		bw.flush();
				
	}
	
	public static int d(int n)
	{
		int result = n;
		while(n >= 10)
		{
			result += n % 10;
			n /= 10;
		}
		result += n;
		
		return result;
	}
			

}
