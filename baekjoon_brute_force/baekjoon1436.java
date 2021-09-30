package baekjoon_brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()), before_num = 0, count = 1, result;
		
		All :
		while(true)
		{
			if(Integer.toString(before_num).contains("666"))
			{
				for(int i = 0; i < 1000; i++)
				{
					if(n == count)
					{
						result = before_num * 1000 + i;
						break All;
					}
					count++;
				}
				before_num++;
			}
			else if(before_num % 100 == 66)
			{
				for(int i = 0; i < 100; i++)
				{
					if(n == count)
					{
						result = before_num * 1000 + 600 + i;
						break All;
					}
					count++;
				}
				before_num++;
			}
			else if(before_num % 10 == 6)
			{
				for(int i = 0; i < 10; i++)
				{
					if(n == count)
					{
						result = before_num * 1000 + 660 + i;
						break All;
					}
					count++;
				}
				before_num++;
			}
			else
			{
				if(n == count)
				{
					result = before_num * 1000 + 666;
					break All;
				}
				count++;
				before_num++;
			}
		}
		
		bw.write(result + "");
		bw.flush();
	}

}
