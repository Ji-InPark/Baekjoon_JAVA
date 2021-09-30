package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)");
		
		int index = 0;
		int result = 0;
		
		
		while(!input[index].contains("-"))
		{
			if(!input[index].contains("+")) 
			{
				result += Integer.parseInt(input[index]);
			}
			index++;
			if(index == input.length)
				break;
		}
		
		for(int i = index; i < input.length; i++)
		{
			if(!(input[i].contains("+") || input[i].contains("-"))) 
			{
				result -= Integer.parseInt(input[i]);
			}
		}
		
		
		bw.write(result + "\n");
		bw.flush();
	}

}
