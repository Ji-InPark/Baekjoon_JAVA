package baekjoon_basic_math_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_string = new String[6];
			input_string = br.readLine().split(" ");
			
			double[] first = new double[3], second = new double[3];
			double distance;
			for(int j = 0; j < 3; j++)
			{
				first[j] = Double.parseDouble(input_string[j]);
				second[j] = Double.parseDouble(input_string[j + 3]);
			}
			
			distance = Math.sqrt(((first[0] - second[0]) * (first[0] - second[0]) + (first[1] - second[1]) * (first[1] - second[1])));
			
			if(first[0] == second[0] && first[1] == second[1])
			{
				if(first[2] == second[2])
				{
					bw.write("-1\n");
				}
				else
				{
					bw.write("0\n");
				}
			}
			else
			{
				if(distance < first[2] || distance < second[2])
				{
					if(first[2] > second[2])
					{
						if(distance + second[2] < first[2])
						{
							bw.write("0\n");
						}
						else if(distance + second[2] > first[2]) 
						{
							bw.write("2\n");
						}
						else
						{
							bw.write("1\n");
						}
					}
					else if(first[2] < second[2])
					{
						if(distance + first[2] < second[2])
						{
							bw.write("0\n");
						}
						else if(distance + first[2] > second[2]) 
						{
							bw.write("2\n");
						}
						else
						{
							bw.write("1\n");
						}
					}
					else
					{
						bw.write("2\n");
					}
				}
				else
				{
					if(distance > (first[2] + second[2]))
					{
						bw.write("0\n");
					}
					else if(distance < (first[2] + second[2]))
					{
						bw.write("2\n");
					}
					else
					{
						bw.write("1\n");
					}
				}
			}
		}
		bw.flush();
	}

}
