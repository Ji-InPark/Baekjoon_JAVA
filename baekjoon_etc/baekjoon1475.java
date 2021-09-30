package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1475 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		int[] arr = new int[10];
		
		int n = Integer.parseInt(br.readLine());

		
		while(n > 0)
		{
			arr[n % 10]++;
			
			n /= 10;
		}
		
		int temp = arr[6] + arr[9];
		
		if(temp % 2 != 0)
			temp++;
		arr[6] = temp / 2;
		arr[9] = temp / 2;
		
		int max = 1;
		
		for(int i = 0; i < 10; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		
		bw.write(max + "\n");
		bw.flush();
	}

}
