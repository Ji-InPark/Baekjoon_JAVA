package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class baekjoon1629 {

	static long a, b, c;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		a = Integer.parseInt(input[0]);
		b = Integer.parseInt(input[1]);
		c = Integer.parseInt(input[2]);
		
		if(b == 1)
		{
			bw.write(a % c + "\n");
		}
		else
		{
			bw.write(pow(a, b) % c + "\n");
		}
		bw.flush();
	}

	public static long pow(long x, long m)
	{
		if(m == 0)
			return 1;
		else if(m == 1)
			return x;
		
		if(m % 2 > 0)
			return pow(x, m - 1) * x;
		
		long half = pow(x, m / 2);
		half %= c;
		
		return half * half % c;
		
	}
}
