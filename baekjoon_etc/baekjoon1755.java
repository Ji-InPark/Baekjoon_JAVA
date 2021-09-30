package baekjoon_etc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class baekjoon1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] input = br.readLine().split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int m = Integer.parseInt(input[0]), n = Integer.parseInt(input[1]);

        String[] arr = new String[n - m + 1];

        for(int i = m; i <= n; i++)
        {
            int now = i;
            String temp = "";

            if(i >= 10)
            {
                temp += nums[now / 10] + " ";
                now %= 10;
            }

            temp += nums[now];

            map.put(temp, i);

            arr[i - m] = temp;
        }

        Arrays.sort(arr);

        for(int i = 0; i <= n - m + 1; i += 10)
        {
            for(int j = 0; j < 10 && i + j <= n - m; j++)
            {
                bw.write(map.get(arr[i + j]) + " ");
            }
            bw.write("\n");
        }
        bw.flush();

    }
}
