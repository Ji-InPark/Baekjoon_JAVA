package baekjoon_etc;

import java.io.*;
import java.math.BigInteger;

public class baekjoon1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input_nums = br.readLine().split(" ");
        BigInteger n = new BigInteger(input_nums[0]), s = new BigInteger(input_nums[1]);

        bw.write(n.divide(s).toString() + "\n" + n.remainder(s).toString());
        bw.flush();
    }
}
