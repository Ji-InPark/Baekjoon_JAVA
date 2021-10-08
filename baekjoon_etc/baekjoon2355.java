package baekjoon_etc;

import java.io.*;

public class baekjoon2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        long start = Long.parseLong(input[0]), end = Long.parseLong(input[1]);

        if(start > end)
        {
            long temp = end;
            end = start;
            start = temp;
        }

        long result = ((start + end) * (end - start + 1)) / 2;

        bw.write(result + "\n");
        bw.flush();
    }
}
