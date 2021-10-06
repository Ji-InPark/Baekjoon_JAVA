package baekjoon_etc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[n + 1][n + 1];
        boolean[] visit = new boolean[n + 1];

        int result = 0;

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i < m; i++)
        {
            String[] input = br.readLine().split(" ");

            arr[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = true;
            arr[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = true;
        }

        q.add(1);
        visit[1] = true;

        while(!q.isEmpty())
        {
            int now = q.poll();
            for(int i = 1; i <= n; i++)
            {
                if(!visit[i] && arr[now][i])
                {
                    visit[i] = true;
                    result++;
                    q.add(i);
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
