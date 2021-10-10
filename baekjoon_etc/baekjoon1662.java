package baekjoon_etc;

import java.io.*;
import java.util.Stack;

public class baekjoon1662 {
    static int index = 0;
    static Stack<Character> s = new Stack<Character>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        String input = br.readLine();

        result = solve(input, 0);

        bw.write(result + "\n");
        bw.flush();
    }

    public static int solve(String input, int level)
    {
        int result = 0;
        while(index < input.length())
        {
            if(input.charAt(index) == '(')
            {
                s.add(input.charAt(index));
                index++;
                result += solve(input, level + 1) * Character.getNumericValue(s.pop());
            }
            else if(input.charAt(index) == ')')
            {
                index++;
                break;
            }
            else
            {
                s.add(input.charAt(index++));
            }
        }

        if(level > 0)
        {
            while(s.peek() != '(')
            {
                s.pop();
                result++;
            }
            s.pop();

            return result;
        }

        while(!s.isEmpty())
        {
            s.pop();
            result++;
        }

        return result;


    }
}
