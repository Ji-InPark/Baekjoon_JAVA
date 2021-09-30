package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10829 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		solve(n);
		
		bw.flush();

	}
	
	public static void solve(long n) throws IOException
	{
		long result = n % 2;
		long next = n / 2;
		
		if(next == 1)
		{
			bw.write(next + "" + result);
			return;
		}
		else
		{
			solve(next);
		}
		
		bw.write(result + "");
	}

}
