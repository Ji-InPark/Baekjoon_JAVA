package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon16916 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = br.readLine();
		String pattern = br.readLine();
		
		int psize = pattern.length(), index = 0, result = 0;
		int[] arr = new int[psize];
		
		setTable(pattern, arr);
		
		for(int i = 0; i < string.length(); i++)
		{
			while(index > 0 && string.charAt(i) != pattern.charAt(index))
			{
				index = arr[index - 1];
			}
			
			if(string.charAt(i) == pattern.charAt(index))
			{
				index++;
				
				if(index == psize)
				{
					result = 1;
					break;
				}
			}
		}
		
		bw.write(result + "\n");
		bw.flush();

	}
	
	public static void setTable(String pattern, int[] arr)
	{
		int i, j = 0;
		
		for(i = 1; i < pattern.length(); i++)
		{
			while(j > 0 && pattern.charAt(i) != pattern.charAt(j))
			{
				j = arr[j - 1];
			}
			
			if(pattern.charAt(i) == pattern.charAt(j))
			{
				arr[i] = ++j;
			}
		}
	}

}
