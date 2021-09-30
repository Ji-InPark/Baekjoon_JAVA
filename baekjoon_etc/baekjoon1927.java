package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class baekjoon1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0)
			{
				if(pq.size() == 0)
				{
					bw.write("0\n");
				}
				else
				{
					bw.write(pq.poll() + "\n");
				}
			}
			else
			{
				pq.add(input);
			}
		}
		
		bw.flush();
	}

}
