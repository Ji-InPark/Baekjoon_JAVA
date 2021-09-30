package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < n; a++)
		{
			Stack<String> s = new Stack<String>();
			String[] input = br.readLine().split("");
			
			boolean is_yes = true;
			
			for(int i = 0; i < input.length; i++)
			{
				if(input[i].equals("("))
					s.add(input[i]);
				else if(input[i].equals(")"))
				{
					if(s.size() == 0)
					{
						is_yes = false;
						break;
					}
					
					s.pop();
				}
			}
			
			if(s.size() != 0)
				is_yes = false;
			
			if(is_yes)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		bw.flush();

	}

}
