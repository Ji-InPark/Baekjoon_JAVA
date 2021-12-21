package baekjoon_etc;

import java.io.*;

public class baekjoon5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result;
        while(true)
        {
            String[] input = br.readLine().split(" ");
            int first = Integer.parseInt(input[0]), second = Integer.parseInt(input[1]);

            if(first == 0 && second == 0)
                break;

            if(second % first == 0)
            {
                result = "factor\n";
            }
            else if(first % second == 0)
            {
                result = "multiple\n";
            }
            else
            {
                result = "neither\n";
            }
            bw.write(result);
        }
        bw.flush();
    }
}
