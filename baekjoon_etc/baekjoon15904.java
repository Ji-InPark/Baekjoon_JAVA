package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon15904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int index = 0;
		
		char[] compare = {'U', 'C', 'P', 'C', '0'};
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == compare[index])
				index++;
		}
		
		if(index == 4)
			bw.write("I love UCPC");
		else
			bw.write("I hate UCPC");
		
		bw.flush();
	}

}
