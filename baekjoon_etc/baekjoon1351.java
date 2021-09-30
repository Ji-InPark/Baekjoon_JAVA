package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class baekjoon1351 {

	static HashMap<Long, Long> map = new HashMap<Long, Long>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		long n = Long.parseLong(input[0]), p = Long.parseLong(input[1]), q = Long.parseLong(input[2]);
		
		long result = solve(n, p, q);
		
		bw.write(result + "\n");
		bw.flush();

	}
	
	public static long solve(long n, long p, long q)
	{
		if(n == 0)
			return 1;
		else
		{
			long p_temp;
			long q_temp;
			if(map.containsKey(n / p))
				p_temp = map.get(n / p);
			else
			{
				p_temp = solve(n / p, p, q);
				map.put(n / p, p_temp);
			}
			
			if(map.containsKey(n / q))
				q_temp = map.get(n / q);
			else
			{
				q_temp = solve(n / q, p, q);
				map.put(n / q, q_temp);
			}
				
			
			return p_temp + q_temp;
		}
	}

}
