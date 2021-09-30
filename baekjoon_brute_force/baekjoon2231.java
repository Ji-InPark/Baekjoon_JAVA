package baekjoon_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()), result = 0, temp = n, cal = 0;
		
		for(int i = n / 2; i < n; i++)
		{
			temp = i;
			cal = i;
			while(temp > 0)
			{
				cal += temp % 10;
				temp /= 10;
			}
			
			if(cal == n)
			{
				result = i;
				break;
			}
		}
		
		bw.write(result + "");
		bw.flush();
		
		
	}

}
