package baekjoon_recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), result = 0;
		int[][] hanoi = new int[n + 1][1];
		
		boolean[] is_first = new boolean[1];
		is_first[0] = true;
		
		for(int i = 1; i < n + 1; i++)
		{
			Arrays.fill(hanoi[i], 1);
		}
		
		for(int i = 0; i < n; i++)
		{
			result += (int)Math.pow(2, i);
		}
		
		bw.write(result + "\n");
		hanoi_tower(n, n, hanoi, is_first);
		bw.flush();

	}

	public static void hanoi_tower(int n, int now_n, int[][] hanoi, boolean[] is_first) throws IOException
	{
		if(n % 2 == 0)
		{
			if(now_n == 1)
			{
				if(is_first[0])
				{
					is_first[0] = false;
					bw.write(hanoi[now_n][0] + " ");
					hanoi[now_n][0] = 2;
					bw.write(hanoi[now_n][0] + "\n");
				}
				else
				{
					bw.write(hanoi[now_n][0] + " ");
					hanoi[now_n][0] += 1;
					if(hanoi[now_n][0] > 3)
					{
						hanoi[now_n][0] = 1;
					}
					bw.write(hanoi[now_n][0] + "\n");
				}
			}
			else
			{			
				hanoi_tower(n, now_n - 1, hanoi, is_first);
				bw.write(hanoi[now_n][0] + " ");
				if(now_n == n)
				{				
					hanoi[now_n][0] = 3;
				}
				else
				{
					if(now_n % 2 == 0)
					{
						hanoi[now_n][0] -= 1;
						if(hanoi[now_n][0] < 1)
						{
							hanoi[now_n][0] = 3;
						}
					}
					else
					{
						hanoi[now_n][0] += 1;
						if(hanoi[now_n][0] > 3)
						{
							hanoi[now_n][0] = 1;
						}
					}
				}
				bw.write(hanoi[now_n][0] + "\n");
				hanoi_tower(n, now_n - 1, hanoi, is_first);
			}
		}
		else
		{
			if(now_n == 1)
			{
				if(is_first[0])
				{
					is_first[0] = false;
					bw.write(hanoi[now_n][0] + " ");
					hanoi[now_n][0] = 3;
					bw.write(hanoi[now_n][0] + "\n");
				}
				else
				{
					bw.write(hanoi[now_n][0] + " ");
					hanoi[now_n][0] -= 1;
					if(hanoi[now_n][0] < 1)
					{
						hanoi[now_n][0] = 3;
					}
					bw.write(hanoi[now_n][0] + "\n");
				}
			}
			else
			{			
				hanoi_tower(n, now_n - 1, hanoi, is_first);
				bw.write(hanoi[now_n][0] + " ");
				if(now_n == n)
				{				
					hanoi[now_n][0] = 3;
				}
				else
				{
					if(now_n % 2 == 0)
					{
						hanoi[now_n][0] += 1;
						if(hanoi[now_n][0] > 3)
						{
							hanoi[now_n][0] = 1;
						}
					}
					else
					{
						hanoi[now_n][0] -= 1;
						if(hanoi[now_n][0] < 1)
						{
							hanoi[now_n][0] = 3;
						}
					}
				}
				bw.write(hanoi[now_n][0] + "\n");
				hanoi_tower(n, now_n - 1, hanoi, is_first);
			}
		}
		
	}
}
