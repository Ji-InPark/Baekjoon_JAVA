package baekjoon_etc;

import java.io.*;

public class baekjoon4095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            String[] nums = br.readLine().split(" ");
            int n = Integer.parseInt(nums[0]), m = Integer.parseInt(nums[1]);

            if(n == 0 && m == 0)
                break;

            int[][] dp = new int[n + 1][m + 1];

            int result = 0;

            for(int i = 1; i <= n; i++)
            {
                String[] input = br.readLine().split(" ");
                int length = 0;
                for(int j = 1; j <= m; j++)
                {
                    if(input[j - 1].equals("1"))
                    {
                        dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j])) + 1;

                        result = Math.max(result, dp[i][j]);
                    }

                }
            }

            bw.write(result + "\n");
        }
        bw.flush();
    }
}
