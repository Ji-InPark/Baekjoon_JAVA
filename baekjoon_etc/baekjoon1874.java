package baekjoon_etc;

import java.io.*;
import java.util.Stack;

public class baekjoon1874 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder result = new StringBuilder("");
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        if(solve(n))
            bw.write(result.toString());
        else
            bw.write("NO");

        bw.flush();
    }

    public static boolean solve(int n) throws IOException {
        int now = 1;
        Stack<Integer> s = new Stack<Integer>();

        while(now <= n)
        {
            int input = Integer.parseInt(br.readLine());

            if(input < now)
            {
                if(s.size() != 0 && s.peek() == input)
                {
                    result.append("-\n");
                    s.pop();
                    continue;
                }
                else
                {
                    return false;
                }
            }
            if(input >= now)
            {
                while(input >= now)
                {
                    s.add(now++);
                    result.append("+\n");
                }

                if(s.size() != 0 && s.peek() == input)
                {
                    result.append("-\n");
                    s.pop();
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }

        while(s.size() != 0)
        {
            int input = Integer.parseInt(br.readLine());

            if(input == s.peek())
            {
                result.append("-\n");
                s.pop();
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}
