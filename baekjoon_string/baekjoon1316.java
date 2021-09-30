package baekjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int for_num = Integer.parseInt(br.readLine());
		boolean[] alphabet = new boolean[26];
		int result = 0;
		
		for(int i = 0; i < for_num; i++)
		{
			Arrays.fill(alphabet, true);
			String input_string = br.readLine();
			int pre_num = 0;
			
			for(int j = 0; j < input_string.length(); j++)
			{
				if(pre_num != input_string.charAt(j)) 
				{
					if(alphabet[input_string.charAt(j) - 97])
					{
						alphabet[input_string.charAt(j) - 97] = false;
						pre_num = input_string.charAt(j);
					}
					else
					{
						result--;
						break;
					}
				}
			}
			result++;
		}
		System.out.println(result);
	}

}
