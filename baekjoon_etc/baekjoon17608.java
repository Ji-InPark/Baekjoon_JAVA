package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon17608 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> s = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine()), max_num = 0, result = 0;
		
		for(int i = 0; i < n; i++)
		{
			s.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = 0; i < n; i++)
		{
			if(s.peek() > max_num)
			{
				result++;
				max_num = s.pop();
			}
			else
				s.pop();
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
