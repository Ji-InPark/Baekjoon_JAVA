package baekjoon_etc;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]), index = 0;

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 1; i <= n; i++)
            q.add(i);

        bw.write("<");
        while(q.size() != 1)
        {
            for(int i = 0; i < k - 1; i++)
                q.add(q.poll());
            bw.write(q.poll() + ", ");
        }
        bw.write(q.poll() + ">");
        bw.flush();
    }
}
