package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon18119 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
		
		int remember = 0;
		
		for(int i = 0; i < 26; i++)
			remember += (1 << i);
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			String temp = br.readLine();
			
			for(int j = 0; j < temp.length(); j++)
			{
				nums[i] |= (1 << temp.charAt(j) - 'a');
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			String[] commands = br.readLine().split(" ");
			
			int result = 0;
			
			remember ^= (1 << commands[1].charAt(0) - 'a');
			
			for(int j = 0; j < n; j++)
				if((nums[j] & remember) == nums[j]) result++;
			
			bw.write(result + "\n");
		}
		bw.flush();

	}

}
