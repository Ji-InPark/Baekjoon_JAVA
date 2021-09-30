package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] input_string = new String[n];
		
		input_string[0] = br.readLine();
		String over = input_string[0];
		
		for(int i = 1; i < n; i++)
		{
			input_string[i] = br.readLine();
			
			String[] temp_string;
			try {
				temp_string = over.split("\\?");
				
			} catch (Exception e) {
				temp_string = new String[1];
				temp_string[0] = over;
			}
			
			
			boolean flag = false;
			for(int a = 0; a < temp_string.length; a++)
			{
				if(!input_string[i].contains(temp_string[a]))
				{
					flag = true;
					break;
				}
			}
			
			if(flag)
			{
				String temp = "";
				for(int j = 0; j < input_string[i].length(); j++)
				{
					if(input_string[i].charAt(j) == over.charAt(j))
					{
						temp += over.charAt(j);
					}
					else
					{
						temp += "?";
					}
				}
				over = temp;
			}
			
		}
		
		bw.write(over);
		bw.flush();
	}

}
