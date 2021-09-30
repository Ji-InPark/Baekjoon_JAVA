package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long result = 0;
		
		String input = br.readLine();
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == '(')
			{
				if(input.charAt(i + 1) == ')')
				{
					result += s.size();
					i++;
				}
				else
				{
					s.add('(');
				}
			}
			else
			{
				s.pop();
				result++;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();

	}

}
