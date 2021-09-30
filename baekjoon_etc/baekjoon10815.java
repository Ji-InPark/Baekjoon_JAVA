package baekjoon_etc;

import java.io.*;
import java.util.Arrays;

public class baekjoon10815 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        String[] m_input = br.readLine().split(" ");

        for(int i = 0; i < m; i++)
        {
            bw.write(find(Integer.parseInt(m_input[i])) + " ");
        }
        bw.flush();
    }

    public static int find(int n)
    {
        int left = 0, right = arr.length - 1, mid;

        while(left <= right)
        {
            mid = (left + right) / 2;

            if(arr[mid] == n)
            {
                return 1;
            }
            else if(arr[mid] > n)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return 0;
    }
}
