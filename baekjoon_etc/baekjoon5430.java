package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class baekjoon5430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < for_num; a++)
		{
			String[] commands = br.readLine().split("");
			int n = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(",");
			arr[0] = arr[0].replace("[", "");
			if(n != 0)
				arr[n - 1] = arr[n - 1].replace("]", "");

			Deque<String> arr_list = new LinkedList<String>(Arrays.asList(arr));
			
			if(n == 0)
				arr_list.clear();

			boolean is_error = false;
			boolean is_left = true;
			
			for(int i = 0; i < commands.length; i++)
			{
				if(commands[i].equals("R"))
				{
					is_left = !is_left;
				}
				else if(commands[i].equals("D"))
				{
					if(arr_list.size() == 0)
					{
						is_error = true;
						break;
					}
					
					if(is_left)
					{
						arr_list.removeFirst();
					}
					else
					{
						arr_list.removeLast();
					}
				}
			}
			
			if(is_error)
			{
				bw.write("error\n");
			}
			else
			{
				if(arr_list.size() == 0)
					bw.write("[");
				else
					if(is_left)
						bw.write("[" + arr_list.pollFirst());
					else
						bw.write("[" + arr_list.pollLast());
				while(arr_list.size() != 0)
				{
					if(is_left)
						bw.write("," + arr_list.pollFirst());
					else
						bw.write("," + arr_list.pollLast());
				}
				bw.write("]\n");
			}
		}
		bw.flush();

	}

}
