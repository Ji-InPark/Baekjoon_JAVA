package baekjoon_if;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2884 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nums = new String[2];
		
		nums = br.readLine().split(" ");
		
		int hour = Integer.parseInt(nums[0]);
		int minute = Integer.parseInt(nums[1]);

		if(minute < 45)
		{
			hour--;
			if(hour < 0)
			{
				hour = 23;
			}
			minute = minute + 15;
		}
		else
		{
			minute -= 45;
		}
		
		bw.write(hour + " " + minute);
		bw.flush();
	}

}
