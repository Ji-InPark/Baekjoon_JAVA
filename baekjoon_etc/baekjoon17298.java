package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] input_arr = br.readLine().split(" ");
		
		int[] result = new int[n];
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			while(true)
			{
				if(s.isEmpty())
					break;
				
				if(Integer.parseInt(input_arr[s.peek()]) < Integer.parseInt(input_arr[i]))
				{
					result[s.pop()] = Integer.parseInt(input_arr[i]);
				}
				else
				{
					break;
				}
			}
			
			s.add(i);
		}
		
		while(!s.isEmpty())
		{
			result[s.pop()] = -1;
		}
		
		for(int i = 0; i < n; i++)
		{
			bw.write(result[i] + " ");
		}
		
		bw.flush();

	}

}
