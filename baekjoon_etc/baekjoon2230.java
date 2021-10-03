package baekjoon_etc;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class baekjoon2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input_nums = br.readLine().split(" ");
        int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]);
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int left = 0, result = Integer.MAX_VALUE, sub = 0;

        for(int right = 0; right < n; right++)
        {
            sub = arr[right] - arr[left];

            if(sub >= m)
            {
                while(sub >= m && left < right)
                {
                    if(sub < result)
                        result = sub;
                    sub = arr[right] - arr[++left];
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
