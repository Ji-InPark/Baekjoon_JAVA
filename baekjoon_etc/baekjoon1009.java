package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon1009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int for_num = Integer.parseInt(br.readLine());
		int[][] array = new int[11][];
		
		array[1] = new int[1];
		array[1][0] = 1;
		
		array[2] = new int[4];
		array[2][0] = 2;
		array[2][1] = 4;
		array[2][2] = 8;
		array[2][3] = 6;
		
		array[3] = new int[4];
		array[3][0] = 3;
		array[3][1] = 9;
		array[3][2] = 7;
		array[3][3] = 1;
		
		array[4] = new int[2];
		array[4][0] = 4;
		array[4][1] = 6;
		
		array[5] = new int[1];
		array[5][0] = 5;
		
		array[6] = new int[1];
		array[6][0] = 6;
		
		array[7] = new int[4];
		array[7][0] = 7;
		array[7][1] = 9;
		array[7][2] = 3;
		array[7][3] = 1;
		
		array[8] = new int[4];
		array[8][0] = 8;
		array[8][1] = 4;
		array[8][2] = 2;
		array[8][3] = 6;
		
		array[9] = new int[2];
		array[9][0] = 9;
		array[9][1] = 1;
		
		array[0] = new int[1];
		array[0][0] = 10;
		
		for(int i = 0; i < for_num; i++)
		{
			String[] input_nums = br.readLine().split(" ");
			int a = Integer.parseInt(input_nums[0]), b = Integer.parseInt(input_nums[1]);
			
			bw.write(array[a % 10][(b - 1) % array[a % 10].length] + "\n");
		}
		bw.flush();
	}

}
