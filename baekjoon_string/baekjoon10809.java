package baekjoon_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input_string  = br.readLine();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for(int i = 0; i < input_string.length(); i++)
		{
			if(alphabet[input_string.charAt(i) - 97] == -1)
			{
				alphabet[input_string.charAt(i) - 97] = i;
			}
		}
		
		for(int i = 0; i < 26; i++)
		{
			bw.write(alphabet[i] + " ");
		}
		bw.flush();
	}

}
