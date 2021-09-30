package baekjoon_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int for_num = Integer.parseInt(br.readLine());
		String[] nums = new String[2];

		for(int i = 0; i < for_num; i++)
		{
			nums = br.readLine().split(" ");
			bw.write(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + "\n");
		}
		
		bw.flush();

	}

}
