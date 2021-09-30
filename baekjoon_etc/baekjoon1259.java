package baekjoon_etc;

import java.io.*;

public class baekjoon1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            String input = br.readLine();

            if(input.equals("0"))
                break;

            bw.write(solve(input) ? "yes\n" : "no\n");
        }
        bw.flush();
    }

    public static boolean solve(String input)
    {

        for(int i = 0; i < input.length() / 2; i++)
        {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i))
                return false;
        }

        return true;
    }
}
