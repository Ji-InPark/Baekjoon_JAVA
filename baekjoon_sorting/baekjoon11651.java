package baekjoon_sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<point_2> arr = new ArrayList<>();
		
		for(int i = 0; i < N; i++)
		{
			String[] input = br.readLine().split(" ");
			arr.add(new point_2(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
		}
		
		Collections.sort(arr);;
		
		for(int i = 0; i < N; i++)
		{
			bw.write(arr.get(i).x + " " + arr.get(i).y + "\n");
		}
		bw.flush();
	}
}

class point_2 implements Comparable<point_2>
{
	public int x, y;
	
	public point_2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(point_2 o) {
		if(this.y < o.y)
			return -1;
		else if(this.y > o.y)
			return 1;
		else
		{
			if(this.x < o.x)
				return -1;
			else
				return 1;
		}
	}
}