package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			Stack<String> q = new Stack<String>();
			String[] input = br.readLine().split("");
			
			boolean is_yes = true;
			
			if(input[0].equals("."))
				break;
			
			for(int i = 0; i < input.length; i++)
			{
				if(input[i].equals("("))
				{
					q.add(input[i]);
				}
				else if(input[i].equals("["))
				{
					q.add(input[i]);
				}
				else if(input[i].equals(")"))
				{
					if(q.size() == 0)
					{
						is_yes = false;
						break;
					}
					
					if(!q.pop().equals("("))
					{
						is_yes = false;
						break;
					}
						
				}
				else if(input[i].equals("]"))
				{
					if(q.size() == 0)
					{
						is_yes = false;
						break;
					}
					
					if(!q.pop().equals("["))
					{
						is_yes = false;
						break;
					}
				}
				
			}
			
			if(q.size() != 0)
				is_yes = false;
			
			if(is_yes)
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.flush();

	}

}
