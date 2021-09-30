package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon6603 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] result = new String[6];
		while(true)
		{
			String[] input = br.readLine().split(" ");
			
			if(input[0].equals("0"))
				break;
			
			solve(input, 0, 1, result);
			bw.write("\n");
		}
		bw.flush();

	}
	
	public static void solve(String[] arr, int cnt, int pre, String[] result) throws IOException
	{
		if(cnt == 6)
		{
			for(int i = 0; i < 6; i++)
			{
				bw.write(result[i] + " ");
			}
			bw.write("\n");
		}
		else
		{
			for(int i = pre; i < arr.length; i++)
			{
				result[cnt] = arr[i];
				solve(arr, cnt + 1, i + 1, result);
			}
		}
	}
	
}
