package baekjoon_etc;

import java.io.*;

public class baekjoon1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");

            int first = Integer.parseInt(input[0]), second = Integer.parseInt(input[1]);

            int gcd_num = first > second ? gcd(first, second) : gcd(second, first);

            bw.write((first * second) / gcd_num + "\n");
        }
        bw.flush();
    }

    public static int gcd(int num1, int num2)
    {
        if(num2 == 0)
            return num1;
        else
            return gcd(num2, num1 % num2);
    }
}
