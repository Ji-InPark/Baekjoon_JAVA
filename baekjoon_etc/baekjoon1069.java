package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1069 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");

		int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]), d = Integer.parseInt(input[2]), t = Integer.parseInt(input[3]);
		
		double dis = Math.sqrt(x * x + y * y);
		double result = dis;
		
		if(d < t)
		{
			bw.write(dis + "\n");
		}
		else
		{
			int jump_cnt = (int) (dis / d);
			
			double remain = dis - d * jump_cnt;
			
			result = Math.min(result, remain + t * jump_cnt);
			
			result = Math.min(result, d * (jump_cnt + 1) - dis + t * (jump_cnt + 1));
			
			if(jump_cnt > 0)
				result = Math.min(result, (double)(jump_cnt + 1) * t);
			else
				if(dis < d)
					result = Math.min(result, t * 2.0);
			
			bw.write(result + "\n");
			
		}
		
		bw.flush();
	}

}
