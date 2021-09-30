package baekjoon_string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = scan.nextInt();
		
		for(int i = 0; i < for_num; i++)
		{
			int string_fre = scan.nextInt();
			String input_string = scan.next();
			for(int j = 0; j < input_string.length(); j++)
			{
				for(int k = 0; k < string_fre; k++)
				{
					bw.write(input_string.charAt(j));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
	}

}
