package baekjoon_etc;

import java.io.*;

public class baekjoon1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[n + 1];
        String[] input = br.readLine().split(" ");

        for(int i = 1; i <= n; i++)
        {
            if(input[i - 1].equals("1"))
            {
                arr[i] = true;
            }
        }

        int m = Integer.parseInt(br.readLine());

        for(int i = 0; i < m; i++)
        {
            String[] input_commands = br.readLine().split(" ");

            if(input_commands[0].equals("1"))
            {
                for(int j = Integer.parseInt(input_commands[1]); j <= n; j += Integer.parseInt(input_commands[1]))
                {
                    arr[j] = !arr[j];
                }
            }
            else
            {
                int index = 1, start = Integer.parseInt(input_commands[1]);
                arr[start] = !arr[start];
                while(((start + index) <= n && (start - index) > 0) && arr[start + index] == arr[start - index])
                {
                    arr[start + index] = !arr[start + index];
                    arr[start - index] = !arr[start - index];
                    index++;
                }
            }
        }

        for(int i = 1; i <= n; i += 20)
        {
            for(int j = 0; j < 20 && i + j <= n; j++)
            {
                bw.write(arr[i + j] ? "1 ":"0 ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
