package baekjoon_etc;

import java.io.*;

public class baekjoon1991 {
    static Node[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        arr = new Node[n];

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");

            arr[input[0].charAt(0) - 65] = new Node();

            arr[input[0].charAt(0) - 65].left = arr[input[0].charAt(0) - 65].right = 0;

            if(!input[1].equals("."))
                arr[input[0].charAt(0) - 65].left = input[1].charAt(0);
            if(!input[2].equals("."))
                arr[input[0].charAt(0) - 65].right = input[2].charAt(0);
        }

        first('A');
        bw.write("\n");
        second('A');
        bw.write("\n");
        third('A');
        bw.flush();
    }

    public static void first(char node) throws IOException {
        bw.write(node);

        if(arr[node - 65].left != 0)
        {
            first(arr[node - 65].left);
        }

        if(arr[node - 65].right != 0)
        {
            first(arr[node - 65].right);
        }
    }

    public static void third(char node) throws IOException {
        if(arr[node - 65].left != 0)
        {
            third(arr[node - 65].left);
        }

        if(arr[node - 65].right != 0)
        {
            third(arr[node - 65].right);
        }

        bw.write(node);
    }

    public static void second(char node) throws IOException {
        if(arr[node - 65].left != 0)
        {
            second(arr[node - 65].left);
        }

        bw.write(node);

        if(arr[node - 65].right != 0)
        {
            second(arr[node - 65].right);
        }
    }


    private static class Node{
        char left, right;

        public Node()
        {}
    }
}


