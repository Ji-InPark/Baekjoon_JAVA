package baekjoon_etc;

import java.io.*;

public class baekjoon11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);

        int result = 1;

        for(int i = n - k + 1; i <= n; i++)
            result *= i;
        for(int i = 1; i <= k; i++)
            result /= i;

        bw.write(result + "\n");
        bw.flush();

    }
}
