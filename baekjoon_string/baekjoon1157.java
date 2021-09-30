package baekjoon_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input_string  = br.readLine();
		input_string = input_string.toUpperCase();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, 0);
		
		for(int i = 0; i < input_string.length(); i++)
		{
			alphabet[(int)input_string.charAt(i) - 65]++;
		}
		
		int max = alphabet[0], max_index = 0;
		boolean is_there_many_max_num = false;
		for(int i = 1; i < 26; i++)
		{
			if(max == alphabet[i])
			{
				is_there_many_max_num = true;
			}
			else if(max < alphabet[i])
			{
				max = alphabet[i];
				max_index = i;
				is_there_many_max_num = false;
			}
			
		}
		
		max_index += 65;
		
		if(is_there_many_max_num)
		{
			bw.write("?");
		}
		else
		{
			bw.write((char)max_index + "");
		}
		
		bw.flush();
	}

}
