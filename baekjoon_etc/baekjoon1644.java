package baekjoon_etc;

import java.io.*;

public class baekjoon1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), index = 0;

        boolean[] prime = new boolean[n + 5];
        int[] arr = new int[n];

        for(int i = 2; i <= n; i++)
        {
            if(!prime[i])
            {
                arr[index++] = i;
                for(int j = i * 2; j <= n; j += i)
                {
                    prime[j] = true;
                }
            }
        }

        int left = 0, result = 0, sum = 0;

        for(int right = 0; right < index; right++)
        {
            sum += arr[right];

            if(sum >= n)
            {
                if(sum == n)
                    result++;

                while(sum > n)
                {
                    sum -= arr[left++];
                    if(sum == n)
                        result++;
                }

            }
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
