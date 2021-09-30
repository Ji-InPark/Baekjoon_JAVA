package baekjoon_etc;

import java.io.*;

public class baekjoon14562 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");
            result = Integer.MAX_VALUE;

            solve(Integer.parseInt(input[0]), Integer.parseInt(input[1]), 0);

            bw.write(result + "\n");
        }
        bw.flush();
    }

    public static void solve(int now, int goal, int level)
    {
        if(now == goal)
        {
            if(result > level)
                result = level;

            return;
        }
        else if(now > goal)
            return;
        else
        {
            solve(now + 1, goal, level + 1);
            solve(now * 2, goal + 3, level + 1);
        }

    }
}
