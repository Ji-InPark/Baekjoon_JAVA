package baekjoon_etc;

import java.io.*;

public class baekjoon1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input_nums = br.readLine().split(" ");
        int n = Integer.parseInt(input_nums[0]), s = Integer.parseInt(input_nums[1]);

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n + 2];
        for(int i = 0; i < n; i++)
        {
            arr[i + 1] = Integer.parseInt(input[i]);
        }

        int left = 0, right = 0, sum = 0, result = 150000;

        while(right <= n)
        {
            if(sum < s)
            {
                sum += arr[++right];
            }
            else
            {
                if(result > right - left)
                    result = right - left;

                sum -= arr[++left];
            }
        }

        bw.write(result == 150000 ? "0" : result + "\n");
        bw.flush();
    }
}
