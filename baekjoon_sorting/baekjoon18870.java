package baekjoon_sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class baekjoon18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] result = new int[N];
		String[] input = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++)
		{
			arr[i] = Integer.parseInt(input[i]);
			result[i] = arr[i];
		}
		
		Arrays.sort(arr);
		
		int cnt = 0, pre = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < N; i++)
		{
			if(pre == arr[i])
				continue;
			map.put(arr[i], cnt++);
			pre = arr[i];
		}
		
		for(int i = 0; i < N; i++)
		{
			bw.write(map.get(result[i]) + " ");
		}
		bw.flush();
	}

}
