package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class baekjoon2217 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i = N; i > 0; i--)
		{
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		int result = 0;
		
		for(int i = N; i > 0; i--)
		{
			result = Math.max(result, pq.poll() * i);
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
