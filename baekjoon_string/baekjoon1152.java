package baekjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_string = br.readLine().trim();
		int result = 1;
		
		for(int i = 0; i < input_string.length(); i++)
		{
			if(input_string.charAt(i) == ' ')
			{
				result++;
			}
		}

		if(input_string.equals(""))
		{
			System.out.println(0);
		}
		else
		{			
			System.out.println(result);
		}
	}

}
