package baekjoon_etc;

import java.io.*;

public class baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[20000005];
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < n; i++)
        {
            arr[10000000 + Integer.parseInt(input[i])]++;
        }

        int m = Integer.parseInt(br.readLine());
        String[] m_input = br.readLine().split(" ");

        for(int i = 0; i < m; i++)
        {
            bw.write(arr[10000000 + Integer.parseInt(m_input[i])] + " ");
        }
        bw.flush();
    }
}
