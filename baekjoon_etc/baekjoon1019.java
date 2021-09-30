package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1019 {

	static long[] cnt = new long[10];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		solve(1, N, 1);
		
		for(int i = 0; i <10; i++)
		{
			bw.write(cnt[i] + " ");
		}
		bw.flush();

	}
	
	public static void calc(int n, int ten)
	{
		
		while(n != 0)
		{
			cnt[n % 10] += ten;
			n /= 10;
		}
	}
	
	public static void solve(int A, int B, int ten)
	{
		while(A % 10 != 0 && A <= B)
		{
			calc(A, ten);
			A++;
		}
		
		if(A > B)
			return;
		
		while(B % 10 != 9 && B >= A)
		{
			calc(B, ten);
			B--;
		}
		
		int num = B / 10 - A / 10 + 1;
		
		for(int i = 0; i < 10; i++)
		{
			cnt[i] += num * ten;
		}
		
		solve(A / 10, B / 10, ten * 10);
	}
}
