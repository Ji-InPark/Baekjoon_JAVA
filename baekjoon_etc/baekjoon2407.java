package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon2407 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_num = br.readLine().split(" ");
		int N = Integer.parseInt(input_num[0]), M = Integer.parseInt(input_num[1]);
		BigInteger num1 = new BigInteger("1");
		BigInteger num2 = new BigInteger("1");
		BigInteger num3 = new BigInteger("1");
		
		if(N - M == 0)
		{
			bw.write("1");
		}
		else
		{
			num1 = factorial(N);
			num2 = factorial(N - M);
			num3 = factorial(N - (N - M));
			
			num2 = num2.multiply(num3);
			num1 = num1.divide(num2);
			
			String result = num1.toString();
			
			bw.write(result + "\n");
		}
		
		bw.flush();
	}
	
	public static BigInteger factorial(int num)
	{
		BigInteger temp = new BigInteger("1");
		for(int i = 1; i <= num; i++)
		{
			temp = temp.multiply(BigInteger.valueOf(i));
		}
		
		return temp;
	}

}
