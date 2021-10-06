package baekjoon_etc;

import java.io.*;

public class baekjoon2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), la = a, lb = b, gcf, lcm;

        while(true)
        {
            if(a > b)
            {
                if(a % b == 0)
                {
                    gcf = b;
                    break;
                }
                else
                    a %= b;
            }
            else
            {
                if(b % a == 0)
                {
                    gcf = a;
                    break;
                }
                else
                    b %= a;
            }
        }

        lcm = la * lb / gcf;

        bw.write(gcf + "\n" + lcm);
        bw.flush();

    }
}
