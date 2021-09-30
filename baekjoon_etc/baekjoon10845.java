package baekjoon_etc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), back = 0;

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i < n; i++)
        {
            String input = br.readLine();

            if(input.contains("push"))
            {
                String[] commands = input.split(" ");
                back = Integer.parseInt(commands[1]);
                q.add(back);
            }
            else if(input.contains("pop"))
            {
                if(q.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(q.poll() + "\n");
                }
            }
            else if(input.contains("size"))
            {
                bw.write(q.size() + "\n");
            }
            else if(input.contains("empty"))
            {
                bw.write(q.isEmpty() ? "1\n" : "0\n");
            }
            else if(input.contains("front"))
            {
                if(q.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(q.peek() + "\n");
                }
            }
            else
            {
                if(q.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(back + "\n");
                }
            }
        }
        bw.flush();
    }
}
