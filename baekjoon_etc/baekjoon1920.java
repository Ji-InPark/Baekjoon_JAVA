package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(input1[i]);
		}
		
		Arrays.sort(arr);
		
		br.readLine();
		String[] input2 = br.readLine().split(" ");
		
		for(int i = 0; i < input2.length; i++)
		{
			bw.write((find(arr, Integer.parseInt(input2[i])) ? "1" : "0") + "\n");
		}
		bw.flush();

	}
	
	public static boolean find(int[] arr, int find_num)
	{
		int high = arr.length - 1, low = 0, mid;
		
		while(low <= high)
		{
			mid = (low + high) / 2;
			if(arr[mid] == find_num)
				return true;
			else if(arr[mid] < find_num)
				low = mid + 1;
			else
				high = mid - 1;
		}
		
		return false;
	}

}
