package baekjoon_etc;

import java.io.*;

public class baekjoon2688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int for_num = Integer.parseInt(br.readLine());

        for(int a = 0; a < for_num; a++)
        {
            int n = Integer.parseInt(br.readLine());
            long[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for(int i = 2; i < n; i++)
            {
                for(int j = 1; j <= 10; j++)
                {
                    arr[j] += arr[j - 1];
                }
            }

            if(n == 1)
                bw.write("10");
            else
            {
                long sum = 0;
                for(int j = 1; j <= 10; j++)
                {
                    sum += arr[j];
                }
                bw.write(sum + "\n");
            }
        }
        bw.flush();
    }
}
