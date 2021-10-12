package baekjoon_etc;

import java.io.*;

public class baekjoon1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int n = Integer.parseInt(input, 16);

        bw.write(n + "\n");
        bw.flush();
    }
}
