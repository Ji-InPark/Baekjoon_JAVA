package baekjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_string = br.readLine();
		int result = 0;
		
		String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < 8; i++)
		{
			if(input_string.contains(alphabet[i]))
			{
				input_string = input_string.replaceFirst(alphabet[i], " ");
				result++;
				i--;
			}
		}
		
		input_string = input_string.trim();
		
		for(int i = 0; i < input_string.length(); i++)
		{
			if(input_string.charAt(i) != ' ')
			{
				result++;
			}
		}
		
		System.out.println(result);
	}

}
