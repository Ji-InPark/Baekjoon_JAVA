package baekjoon_while;

import java.util.Scanner;

public class baekjoon10951 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] input_nums = new int[2];
		
		while(scan.hasNextInt())
		{
			input_nums[0] = scan.nextInt();
			input_nums[1] = scan.nextInt();
			System.out.println(input_nums[0] + input_nums[1]);
		}

	}

}
