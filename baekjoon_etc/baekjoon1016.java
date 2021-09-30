package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1016 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] array = new boolean[1000005];
		
		String[] input_nums = br.readLine().split(" ");
		long min = Long.parseLong(input_nums[0]), max = Long.parseLong(input_nums[1]), index = 2, ans = max - min + 1;
		
		while(index * index <= max)
		{
			long find_num = min / (index * index);
			if(min % (index * index) != 0)
				find_num++;
			
			while(find_num * index * index <= max)
			{
				if(!array[(int) (find_num * index * index - min)])
				{
					array[(int) (find_num * index * index - min)] = true;
					ans--;
				}
				find_num++;
			}
			index++;
		}
		
		bw.write(ans + "\n");
		bw.flush();

	}

}
