package baekjoon_etc;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class baekjoon2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < n; j++)
            {
                pq.add(Integer.parseInt(input[j]));
            }
        }

        for(int i = 0; i < n - 1; i++)
            pq.poll();

        bw.write(pq.poll() + "\n");
        bw.flush();
    }
}
