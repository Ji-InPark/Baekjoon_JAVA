package baekjoon_etc;

import java.io.*;

public class baekjoon10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2005];
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < n; i++)
        {
            arr[1000 + Integer.parseInt(input[i])] = true;
        }

        for(int i = 0; i <= 2000; i++)
        {
            if(arr[i]) bw.write((i - 1000) + " ");
        }
        bw.flush();
    }
}
