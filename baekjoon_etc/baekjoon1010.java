package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon1010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_nums = br.readLine().split(" ");
			int m = Integer.parseInt(input_nums[0]), n = Integer.parseInt(input_nums[1]);
			
			BigInteger son = factorial(n);
			BigInteger mom = factorial(m).multiply(factorial(n - m));
			
			bw.write(son.divide(mom) + "\n");
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
