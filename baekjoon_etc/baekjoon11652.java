package baekjoon_etc;

import java.io.*;
import java.util.HashMap;

public class baekjoon11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long result = Long.MAX_VALUE, sum = 0;

        HashMap<Long, Integer> map = new HashMap<Long, Integer>();

        for(int i = 0; i < n; i++)
        {
            long input = Long.parseLong(br.readLine());

            if(map.containsKey(input))
            {
                map.put(input, map.get(input) + 1);
            }
            else
            {
                map.put(input, 1);
            }

            if(map.get(input) > sum)
            {
                sum = map.get(input);
                result = input;
            }
            else if(map.get(input) == sum)
            {
                if(result > input)
                    result = input;
            }
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
