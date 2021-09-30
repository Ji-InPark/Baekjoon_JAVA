package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class baekjoon1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_string = br.readLine().split(" ");
		int n = Integer.parseInt(input_string[0]), m = Integer.parseInt(input_string[1]);
		
		ArrayList<String> result = new ArrayList<String>();
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < n; i++)
		{
			String input = br.readLine();
			
			map.put(input, input);
		}
		
		for(int i = 0; i < m; i++)
		{
			String input = br.readLine();
			if(map.containsKey(input))
			{
				result.add(input);
			}
		}
		
		result.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		
		bw.write(result.size() + "\n");
		for(int i = 0; i < result.size(); i++)
		{
			bw.write(result.get(i) + "\n");
		}
		bw.flush();
	}

}
