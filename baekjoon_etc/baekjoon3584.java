package baekjoon_etc;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon3584 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int for_num = Integer.parseInt(br.readLine());

        for(int a = 0; a < for_num; a++)
        {
            int n = Integer.parseInt(br.readLine()), index = 0;
            int[] tree = new int[n + 1];

            for(int i = 0; i < n - 1; i++)
            {
                String[] input = br.readLine().split(" ");

                tree[Integer.parseInt(input[1])] = Integer.parseInt(input[0]);
            }

            String[] input_nodes = br.readLine().split(" ");
            int first = Integer.parseInt(input_nodes[0]), second = Integer.parseInt(input_nodes[1]);

            int[] arr = new int[n];

            while(first != 0)
            {
                arr[index++] = first;
                first = tree[first];
            }

            Arrays.sort(arr, 0, index);

            while(!find(arr, index, second))
            {
                second = tree[second];
            }

            bw.write(second + "\n");
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
