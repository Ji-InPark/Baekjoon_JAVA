package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon13305 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] first = br.readLine().split(" "), second = br.readLine().split(" ");
		
		long[] city = new long[n], dist = new long[n - 1], sum = new long[n];
		
		for(int i = 0; i < n - 1; i++)
		{
			city[i] = Long.parseLong(second[i]);
			dist[i] = Long.parseLong(first[i]);
			sum[i + 1] = sum[i] + dist[i];
		}
		city[n - 1] = Integer.parseInt(second[n - 1]);
		
		long result = 0;
		
		int price_index = 0;
		
		for(int i = 1; i < n; i++)
		{
			if(city[price_index] > city[i])
			{
				result += (sum[i] - sum[price_index]) * city[price_index];
				price_index = i;
			}
		}
		result += (sum[n - 1] - sum[price_index]) * city[price_index];
		
		bw.write(result + "\n");
		bw.flush();
		

	}

}
