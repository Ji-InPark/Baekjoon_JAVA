package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int sum = 0, min = 4001, max = -4001, max_cnt = 0, avg = 0, mid = 0, range = 0;
		int[] cnt_arr = new int[8005];
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++)
		{
			int input = Integer.parseInt(br.readLine());
			sum += input;
			
			arr[i] = input;
			
			cnt_arr[input + 4000]++;
			
			if(input > max)
				max = input;
			if(input < min)
				min = input;
		}
		
		for(int i = 0; i < 8005; i++)
		{
			if(cnt_arr[max_cnt] < cnt_arr[i])
				max_cnt = i;
		}
		
		boolean is_first = true;
		
		for(int i = 0; i < 8005; i++)
		{
			if(cnt_arr[max_cnt] == cnt_arr[i] && is_first)
				is_first = false;
			else if(cnt_arr[max_cnt] == cnt_arr[i] && !is_first)
			{
				max_cnt = i;
				break;
			}
		}
		
		Arrays.sort(arr);
		
		avg = (int)Math.round((double)sum / N);
		mid = arr[N / 2];
		max_cnt -= 4000;
		range = max - min;
	
		bw.write(avg + "\n");
		bw.write(mid + "\n");
		bw.write(max_cnt + "\n");
		bw.write(range + "\n");
		bw.flush();
	}

}
