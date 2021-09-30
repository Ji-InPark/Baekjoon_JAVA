package baekjoon_if;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input_num = br.readLine();
		
		if(Integer.parseInt(input_num) >= 90)
		{
			bw.write("A");
		}
		else if(Integer.parseInt(input_num) >= 80)
		{
			bw.write("B");
		}
		else if(Integer.parseInt(input_num) >= 70)
		{
			bw.write("C");
		}
		else if(Integer.parseInt(input_num) >= 60)
		{
			bw.write("D");
		}
		else
		{
			bw.write("F");
		}
		bw.flush();
		
	}

}
