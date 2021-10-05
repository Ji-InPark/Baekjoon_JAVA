package baekjoon_etc;

import java.io.*;
import java.util.PriorityQueue;

public class baekjoon1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), result = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i < n; i++)
        {
            pq.add(Integer.parseInt(br.readLine()));
        }

        while(pq.size() != 1)
        {
            int sum = pq.poll() + pq.poll();

            result += sum;

            pq.add(sum);
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
