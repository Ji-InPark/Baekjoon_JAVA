package baekjoon_etc;

import java.io.*;
import java.util.Arrays;

public class baekjoon2644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), index = 0;
        int[] tree = new int[n + 1];

        String[] find = br.readLine().split(" ");
        int first = Integer.parseInt(find[0]), second = Integer.parseInt(find[1]);

        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++)
        {
            String[] input = br.readLine().split(" ");

            tree[Integer.parseInt(input[1])] = Integer.parseInt(input[0]);
        }

        int[] arr = new int[n];
        int temp_f = first, temp_s = second;

        while(temp_f != 0)
        {
            arr[index++] = temp_f;
            temp_f = tree[temp_f];
        }

        Arrays.sort(arr, 0, index);

        while(!find(arr, index, temp_s) && temp_s != 0)
        {
            temp_s = tree[temp_s];
        }


        if(temp_s == 0)
            bw.write("-1");
        else
        {
            int find_num = temp_s, result = 0;

            while(first != find_num)
            {
                result++;
                first = tree[first];
            }

            while(second != find_num)
            {
                result++;
                second = tree[second];
            }

            bw.write(result + "\n");
        }

        bw.flush();

    }

    public static boolean find(int[] arr, int index, int num)
    {
        int left = 0, right = index - 1, mid;

        while(left <= right)
        {
            mid = (left + right) / 2;

            if(arr[mid] == num)
            {
                return true;
            }
            else if(arr[mid] > num)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return false;
    }
}
