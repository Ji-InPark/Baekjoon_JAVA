package baekjoon_etc;

import java.io.*;

public class baekjoon1593 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[200];
        int[] nums = new int[200];

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);

        String W = br.readLine();
        for(int i = 0; i < n; i++)
        {
            arr[(int)W.charAt(i)] = true;
            nums[(int)W.charAt(i)]++;
        }

        String S = br.readLine();
        int result = 0, match = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[(int)S.charAt(i)])
            {
                if(nums[(int)S.charAt(i)]-- > 0)
                    match++;
            }
        }

        if(match == n)
            result++;

        for(int i = n; i < m; i++)
        {
            if(arr[(int)S.charAt(i)])
            {
                if(nums[(int)S.charAt(i)]-- > 0)
                    match++;
            }
            if(arr[(int)S.charAt(i - n)])
            {
                if(nums[(int)S.charAt(i - n)]++ >= 0)
                    match--;
            }
            if(match == n)
                result++;
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
