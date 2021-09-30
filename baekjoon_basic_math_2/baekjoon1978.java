package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int string_num = Integer.parseInt(br.readLine()), result = 0; 
		String[] input_string = new String[string_num];
		input_string = br.readLine().split(" ");
		
		for(int i = 0; i < string_num; i++)
		{
			int now_num = Integer.parseInt(input_string[i]);
			boolean is_prime = true;
			if(now_num == 1)
			{
				is_prime = false;
			}
			else if(now_num == 2)
			{
			}
			else
			{
				for(int j = 2; j < now_num; j++)
				{
					if(now_num % j == 0)
					{
						is_prime = false;
						break;
					}
				}
			}
			
			if(is_prime)
			{
				result++;
			}
		}
		
		bw.write(result + "");
		bw.flush();
	}

}
