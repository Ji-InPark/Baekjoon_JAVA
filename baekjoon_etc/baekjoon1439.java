package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		char pre = ' ';
		
		int num = 0;
		
		for(int i = 0; i < input.length(); i++)
		{
			if(pre != input.charAt(i))
			{
				pre = input.charAt(i);
				num++;
			}
		}
		
		num /= 2;
		
		bw.write(num + "\n");
		bw.flush();

	}

}
