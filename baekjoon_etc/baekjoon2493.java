package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] input_arr = br.readLine().split(" ");
		int[] arr = new int[n];
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(input_arr[i]);
			
			if(s.isEmpty())
			{
				bw.write("0 ");
			}
			else
			{
				while(true)
				{
					if(s.isEmpty())
					{
						bw.write("0 ");
						break;
					}
					
					if(arr[s.peek()] > arr[i])
					{
						bw.write((s.peek() + 1) + " ");
						break;
					}
					else
					{
						s.pop();
					}
				}
			}
			s.add(i);
		}
		
		bw.flush();

	}

}
