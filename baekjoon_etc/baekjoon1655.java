package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class baekjoon1655 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> lq = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> rq = new PriorityQueue<Integer>();
		int for_num = Integer.parseInt(br.readLine());
		
		int mid = Integer.parseInt(br.readLine());
		
		bw.write(mid + "\n");
		
		for(int i = 1; i < for_num; i++)
		{
			int input = Integer.parseInt(br.readLine());
			
			if(input < mid)
			{
				if(i % 2 == 1) // 이게 짝수
				{
					lq.add(input);
					rq.add(mid);
					mid = lq.poll();
				}
				else
				{
					if(lq.size() > rq.size())
					{
						lq.add(input);
						rq.add(mid);
						mid = lq.poll();
					}
					else
					{
						lq.add(input);
					}
				}
			}
			else if(input == mid)
			{
				if(i % 2 == 1) // 이게 짝수
				{
					lq.add(input);
					lq.add(mid);
					mid = lq.poll();
				}
				else
				{
					if(lq.size() > rq.size())
					{
						rq.add(input);
						rq.add(mid);
						mid = rq.poll();
					}
					else
					{
						lq.add(input);
						lq.add(mid);
						mid = lq.poll();
					}
				}
			}
			else
			{
				if(i % 2 == 1) // 이게 짝수
				{
					rq.add(input);
				}
				else
				{
					if(lq.size() > rq.size())
					{
						rq.add(input);
					}
					else
					{
						lq.add(mid);
						rq.add(input);
						mid = rq.poll();
					}
				}
			}
			
			bw.write(mid + "\n");
		}
		bw.flush();
	}

}
