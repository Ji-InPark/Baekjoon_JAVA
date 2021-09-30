package baekjoon_while;

import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input_num = 0, result = 0, cal_num = -1;

		input_num = scan.nextInt();
		
		while(input_num != cal_num)
		{
			if(result == 0)
			{
				cal_num = ((input_num % 10) * 10) + (((input_num / 10) + (input_num % 10))) % 10;
				result++;
			}
			else
			{
				cal_num = ((cal_num % 10) * 10) + (((cal_num / 10) + (cal_num % 10))) % 10;
				result++;
			}
		}
		System.out.println(result);
	}

}
