package baekjoon_etc;

import java.io.*;

public class baekjoon9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine(), second = br.readLine();

        int[][] dp = new int[first.length() + 1][second.length() + 1];
        int result = 0;

        for(int i = 1; i <= first.length(); i++)
        {
            for(int j = 1; j <= second.length(); j++)
            {
                if(first.charAt(i - 1) == second.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                result = Math.max(result, dp[i][j]);
            }
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
