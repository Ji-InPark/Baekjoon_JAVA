package baekjoon_etc;

import java.io.*;

public class baekjoon2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");

        int n = Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);

        String[] input = br.readLine().split(" ");

        for(int i = 0; i < input.length; i++)
        {
            bw.write(Integer.parseInt(input[i]) - n + " ");
        }
        bw.flush();
    }
}
