package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input_string = br.readLine().split(" ");
		String[] dayOfWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int M = Integer.parseInt(input_string[0]), D = Integer.parseInt(input_string[1]);
		int Y = 2007;
		
		if(M <= 2)
		{
			Y--;
			M += 12;
		}
		
		int result = (Y + Y / 4 - Y / 100 + Y / 400 + (13 * M + 8) / 5 + D) % 7;
		
		bw.write(dayOfWeek[result] + "\n");
		bw.flush();
	}

}
