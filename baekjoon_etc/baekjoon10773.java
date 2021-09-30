package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int for_num = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < for_num; i++)
		{
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0)
				s.pop();
			else
				s.add(n);
		}
		
		int result = 0;
		
		while(s.size() != 0)
		{
			result += s.pop();
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
