package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_string = new String[4];
		
		input_string = br.readLine().split(" ");
		
		int x = Integer.parseInt(input_string[0]), y = Integer.parseInt(input_string[1]);
		int w = Integer.parseInt(input_string[2]), h = Integer.parseInt(input_string[3]), min = x;
		
		if(min > y)
			min = y;
		
		if(h - y < min)
			min = h - y;
		
		if(w - x < min)
			min = w - x;
		
		bw.write(min + "");
		bw.flush();

	}

}
