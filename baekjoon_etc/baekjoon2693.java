package baekjoon_etc;

import java.io.*;
import java.util.Arrays;

public class baekjoon2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");
            int[] arr = new int[10];

            for(int j = 0; j < 10; j++)
            {
                arr[j] = Integer.parseInt(input[j]);
            }

            Arrays.sort(arr);

            bw.write(arr[7] + "\n");
        }
        bw.flush();
    }
}
