package baekjoon_etc;

import java.io.*;
import java.util.Stack;

public class baekjoon17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[1000005], arr = new int[n], result = new int[n];
        String[] input_string = br.readLine().split(" ");

        Stack<Integer> s = new Stack<Integer>();

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(input_string[i]);
            nums[arr[i]]++;
        }

        for(int i = 0; i < n; i++)
        {
            if(s.isEmpty())
                s.add(i);
            else
            {
                while(!s.isEmpty() && nums[arr[s.peek()]] < nums[arr[i]])
                {
                    result[s.pop()] = arr[i];
                }

                s.add(i);
            }
        }

        while(!s.isEmpty())
            result[s.pop()] = -1;

        for(int i = 0; i < n; i++)
        {
            bw.write(result[i] + " ");
        }
        bw.flush();
    }
}
