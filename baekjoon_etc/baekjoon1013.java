package baekjoon_etc;

import java.io.*;
import java.util.regex.Pattern;

public class baekjoon1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String regex = "(100+1+|01)+";

        for(int i = 0; i < n; i++)
        {
            bw.write(Pattern.matches(regex, br.readLine()) ? "YES\n" : "NO\n");
        }
        bw.flush();
    }
}
