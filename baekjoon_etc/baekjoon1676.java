package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		
		for(int i = 1; i <= n; i++)
		{
			int temp = i;
			
			while(temp % 5 == 0)
			{
				result++;
				temp /= 5;
			}
		}
		
		
		
		bw.write(result + "\n");
		bw.flush();
	}

}
