package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class baekjoon1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_arr = br.readLine().split("");
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < input_arr.length; i++)
		{
			s1.add(input_arr[i]);
		}
		
		for(int i = 0; i < for_num; i++)
		{
			String input = br.readLine();
			
			if(input.contains("P"))
			{
				String[] commands = input.split(" ");
				
				s1.add(commands[1]); 
			}
			else
			{
				if(input.contains("L"))
				{
					if(!s1.isEmpty())
						s2.add(s1.pop());
				}
				else if(input.contains("D"))
				{
					if(!s2.isEmpty())
						s1.add(s2.pop());
				}
				else if(input.contains("B"))
				{
					if(!s1.isEmpty())
						s1.pop();
				}
			}
		}
		
		while(!s1.isEmpty())
			s2.add(s1.pop());
		
		while(!s2.isEmpty())
			bw.write(s2.pop());
		
		bw.flush();

	}

}
