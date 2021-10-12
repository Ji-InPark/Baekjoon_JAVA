package baekjoon_etc;

import java.io.*;
import java.math.BigInteger;

public class baekjoon2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger n = new BigInteger(br.readLine());
        BigInteger m = new BigInteger(br.readLine());

        bw.write(n.add(m).toString() + "\n");
        bw.write(n.subtract(m).toString() + "\n");
        bw.write(n.multiply(m).toString() + "\n");
        bw.flush();
    }
}
