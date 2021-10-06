package baekjoon_etc;

import java.io.*;

public class baekjoon2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        boolean is_a = true, is_d = true;


        for(int i = 1; i < input.length; i++)
        {
            if(input[i - 1].compareTo(input[i]) > 0)
            {
                is_a = false;
                break;
            }
        }

        if(is_a)
        {
            bw.write("ascending");
        }
        else
        {
            for(int i = 1; i < input.length; i++)
            {
                if(input[i - 1].compareTo(input[i]) < 0)
                {
                    is_d = false;
                    break;
                }
            }

            if(is_d)
            {
                bw.write("descending");
            }
            else
            {
                bw.write("mixed");
            }
        }
        bw.flush();

    }
}
