package baekjoon_dynamic_programming_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1003 {
	public static void main(String[] args) {
		int for_num = 0;
		int[] one_array = new int[41];
		
		one_array[0] = 0;
		one_array[1] = 1;
		for(int i = 2; i < 41; i++)
		{
			one_array[i] = one_array[i - 1] + one_array[i - 2] ;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for_num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < for_num; i++)
		{
			int n_num = 0;
			try {
				n_num = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(n_num == 0)
			{
				System.out.println("1 0");
			}
			else 
			{
				System.out.printf("%d %d\n", one_array[n_num - 1], one_array[n_num]);
			}
		}
	}
	

}
