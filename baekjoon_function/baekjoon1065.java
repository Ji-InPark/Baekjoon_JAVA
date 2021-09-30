package baekjoon_function;

import java.util.Scanner;

public class baekjoon1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input_num = scan.nextInt(), result = 0;
		
		for(int i = 1; i <= input_num; i++)
		{
			if(is_han_num(i))
			{
				result++;
			}
		}
		
		System.out.println(result);

	}
	
	public static boolean is_han_num(int n)
	{
		int differ = 0, pre_num = 0, cur_num = 0;
		
		if(n < 100)
		{
			return true;
		}
		else if(n == 1000)
		{
			return false;
		}
		else
		{
			pre_num = n % 10;
			n /= 10;
			cur_num = n % 10;
			n /= 10;
			differ = cur_num - pre_num;
			
			pre_num = cur_num;
			cur_num = n % 10;
			if(differ == cur_num - pre_num)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
