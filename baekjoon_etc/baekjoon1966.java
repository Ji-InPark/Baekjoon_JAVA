package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class baekjoon1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < for_num; i++)
		{
			pq.clear();
			String[] input_num = br.readLine().split(" ");
			int N = Integer.parseInt(input_num[0]), M = Integer.parseInt(input_num[1]);
			int find_prio = 0;
			input_num = br.readLine().split(" ");
			
			Queue<String> sq = new LinkedList<>();
			Queue<Integer> iq = new LinkedList<>();
			
			int[] arr = new int[N];
			for(int j = 0; j < N; j++)
			{
				arr[j] = Integer.parseInt(input_num[j]);
				pq.add(arr[j]);
				iq.add(arr[j]);
				if(j == M)
				{					
					find_prio = arr[j];
					sq.add("y");
				}
				else
				{
					sq.add("n");
				}
			}
			
			int result = 0;
			
			while(!pq.isEmpty()) 
			{		
				if(pq.peek() != iq.peek())
				{
					iq.add(iq.poll());
					sq.add(sq.poll());
				}
				else
				{
					if(find_prio == pq.peek())
					{
						if(sq.peek().equals("y"))
						{
							result++;
							bw.write(result + "\n");
							break;
						}
						else
						{
							iq.poll();
							pq.poll();
							sq.poll();
							result++;
						}
					}
					else
					{
						iq.poll();
						pq.poll();
						sq.poll();
						result++;
					}
				}
			}
		}
		
		bw.flush();

	}

}
