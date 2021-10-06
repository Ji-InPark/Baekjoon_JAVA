package baekjoon_etc;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class baekjoon1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int k = Integer.parseInt(input[0]), n = Integer.parseInt(input[1]);
        long[] arr = new long[k];

        long max = 0;

        for(int i = 0; i < k; i++)
        {
            arr[i] = Long.parseLong(br.readLine());
            if(max < arr[i])
                max = arr[i];
        }

        long left = 1, right = max, mid, result = 0;

        while(left <= right)
        {
            mid = (left + right) / 2;

            if(possible(arr, mid, n))
            {
                if(result < mid)
                    result = mid;

                left = mid + 1;
            }
            else
                right = mid - 1;
        }

        bw.write(result + "\n");
        bw.flush();

    }

    public static boolean possible(long[] arr, long mid, int n)
    {
        int result = 0;

        for(int i = 0; i < arr.length; i++)
        {
            result += arr[i] / mid;
        }

        return result >= n;
    }

}
