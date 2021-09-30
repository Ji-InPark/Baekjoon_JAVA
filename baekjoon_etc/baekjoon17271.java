package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon17271 {
	
	static int n, m;
	static long result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		n = Integer.parseInt(input_nums[0]);
		m = Integer.parseInt(input_nums[1]);
		
		int n_nums = n - m, m_nums = 1;
		
		// A스킬(1초)로만 이루어진 스킬 조합
		result++;
		
		while(n_nums > 0)
		{
			solve(n_nums, m_nums);
			n_nums -= m;
			m_nums++;
		}
		
		// B스킬(m초)로만 이루어진 스킬 조합이 가능할 경우
		if(n % m == 0)
			result++;
		
		result %= 1000000007;
		
		bw.write(result + "\n");
		bw.flush();

	}
	
	public static void solve(int n_nums, int m_nums)
	{
		BigInteger fac = new BigInteger("1");
		
		for(int i = n_nums + m_nums; i > n_nums ; i--)
		{
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		
		for(int i = 1; i <= m_nums; i++)
		{
			fac = fac.divide(BigInteger.valueOf(i));
		}
		
		fac = fac.remainder(BigInteger.valueOf(1000000007));
		
		result += fac.longValue();
		
		result %= 1000000007;
	}

}
