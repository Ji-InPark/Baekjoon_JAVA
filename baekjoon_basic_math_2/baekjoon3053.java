package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double r = Double.parseDouble(br.readLine()), pi = 3.14159265358979;
		
		bw.write(r * r * pi + "\n");
		bw.write(r * r * 2.000000 + "\n");
		bw.flush();
	}

}
