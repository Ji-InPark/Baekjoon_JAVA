package baekjoon_etc;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i < n; i++)
        {
            String input = br.readLine();

            if(input.contains("push_front"))
            {
                String[] commands = input.split(" ");
                q.addFirst(Integer.parseInt(commands[1]));
            }
            else if(input.contains("push_back"))
            {
                String[] commands = input.split(" ");
                q.addLast(Integer.parseInt(commands[1]));
            }
            else if(input.contains("pop_front"))
            {
                if(q.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(q.pollFirst() + "\n");
                }
            }
            else if(input.contains("pop_back"))
            {
                if(q.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(q.pollLast() + "\n");
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
                    bw.write(q.peekFirst() + "\n");
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
                    bw.write(q.peekLast() + "\n");
                }
            }
        }
        bw.flush();
    }
}
