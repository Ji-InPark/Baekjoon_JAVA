package baekjoon_etc;

import java.io.*;
import java.util.Stack;

public class baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<Integer>();

        for(int i = 0; i < n; i++)
        {
            String input = br.readLine();

            if(input.contains("push"))
            {
                String[] commands = input.split(" ");

                s.add(Integer.parseInt(commands[1]));
            }
            else if(input.contains("pop"))
            {
                if(s.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(s.pop() + "\n");
                }
            }
            else if(input.contains("size"))
            {
                bw.write(s.size() + "\n");
            }
            else if(input.contains("empty"))
            {
                bw.write(s.isEmpty() ? "1\n" : "0\n");
            }
            else
            {
                if(s.size() == 0)
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(s.peek() + "\n");
                }
            }
        }

        bw.flush();
    }
}
