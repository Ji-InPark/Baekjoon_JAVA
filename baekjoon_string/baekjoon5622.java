package baekjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_string = br.readLine();
		int result = 0;
		
		for(int i = 0; i < input_string.length(); i++)
		{
			if((int)input_string.charAt(i) == 80)
			{
				result += 8;
			}
			else if((int)input_string.charAt(i) < 80)
			{
				result += ((int)input_string.charAt(i) + 1) / 3 - 19;
			}
			else if((int)input_string.charAt(i) == 90)
			{
				result += 10;
			}
			else if((int)input_string.charAt(i) > 80)
			{
				result += (int)input_string.charAt(i) / 3 - 19;
			}
		}
		
		System.out.println(result);

	}

}
