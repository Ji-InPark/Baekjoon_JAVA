package baekjoon_etc;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class baekjoon6137 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder i_sb = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            i_sb.append(br.readLine());
        }

        String input = i_sb.toString();
        StringBuilder sb = new StringBuilder();

        int left = 0, right = n - 1;

        while(left != right)
        {
            if(input.charAt(left) < input.charAt(right))
            {
                sb.append(input.charAt(left++));
            }
            else if(input.charAt(left) > input.charAt(right))
            {
                sb.append(input.charAt(right--));
            }
            else
            {
                if(is_left(input, left, right))
                    sb.append(input.charAt(left++));
                else
                    sb.append(input.charAt(right--));
            }
        }
        sb.append(input.charAt(left));

        String result = sb.toString();

        for(int i = 0; i < result.length(); i += 80)
        {
            for(int j = 0; j < 80 && i + j < result.length(); j++)
            {
                bw.write(result.charAt(i + j));
            }
            bw.write("\n");
        }

        bw.flush();
    }

    public static boolean is_left(String input, int left, int right)
    {
        if(left <= right)
        {
            if(input.charAt(left + 1) < input.charAt(right - 1))
            {
                return true;
            }
            else if(input.charAt(left + 1) > input.charAt(right - 1))
            {
                return false;
            }
            else
            {
                return is_left(input, left + 1, right - 1);
            }
        }
        else
        {
            return true;
        }
    }
}
