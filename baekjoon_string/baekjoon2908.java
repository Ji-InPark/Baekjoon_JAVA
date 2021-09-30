package baekjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_strings = new String[2];
		input_strings = br.readLine().split(" ");
		int result_index = 0, result = 0;
		
		for(int i = 2; i >= 0; i--)
		{
			if((int)input_strings[0].charAt(i) > (int)input_strings[1].charAt(i))
			{
				result_index = 0;
				break;
			}
			else if((int)input_strings[0].charAt(i) == (int)input_strings[1].charAt(i)) 
			{
				continue;
				
			}
			else
			{
				result_index = 1;
				break;
			}
		}
		
		for(int i = 2; i >= 0; i--)
		{
			result = result * 10 + (int)input_strings[result_index].charAt(i) - 48;
		} 
		
		System.out.println(result);
	}

}
