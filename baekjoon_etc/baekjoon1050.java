package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class baekjoon1050 {
	static Map<String, Integer> map1 = new HashMap<String, Integer>();
	static Map<String, String[]> map2 = new HashMap<String, String[]>();
	static Map<String, Integer> check = new HashMap<String, Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input_nums = br.readLine().split(" ");
		
		int n = Integer.parseInt(input_nums[0]), m = Integer.parseInt(input_nums[1]);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			String[] input = br.readLine().split(" ");
			
			if(input[0].equals("LOVE"))
				arr1.add(Integer.parseInt(input[1]));
			else
				map1.put(input[0], Integer.parseInt(input[1]));			
		}
		
		ArrayList<String[]> arr2 = new ArrayList<String[]>();
		
		for(int i = 0; i < m; i++)
		{
			String[] input1 = br.readLine().split("=");
			String[] input2 = input1[1].split("\\+");
			
			if(input1[0].equals("LOVE"))
				arr2.add(input2);
			else
			{
				map2.put(input1[0], input2);
			}
		}

		int result = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr1.size(); i++)
		{
			if(result > arr1.get(i))
				result = arr1.get(i);
		}
		
		for(int i = 0; i < arr2.size(); i++)
		{
			int temp = 0;
			boolean flag = true;
			for(int j = 0; j < arr2.get(i).length; j++)
			{
				int temp2 = solve(arr2.get(i)[j].substring(1));
				
				if(temp2 == Integer.MAX_VALUE)
				{
					flag = false;
					break;
				}
				
				temp += temp2 * (arr2.get(i)[j].charAt(0) - '0');
			}
			
			if(flag)
				if(result > temp)
					result = temp;
		}
		
		if(result == Integer.MAX_VALUE)
		{
			bw.write("-1");
		}
		else if(result > 1000000000)
		{
			bw.write("1000000001");
		}
		else
		{
			bw.write(result + "\n");
		}
		
		bw.flush();
		
	}
	
	public static int solve(String item)
	{
		if(map1.containsKey(item))
		{
			return map1.get(item);
		}
		else if(map2.containsKey(item)) 
		{
			int result = 0;
			check.put(item, 0);
			for(int i = 0; i < map2.get(item).length; i++)
			{				
				if(check.containsKey(map2.get(item)[i]))
				{
					check.clear();
					return Integer.MAX_VALUE;
				}
				else
				{
					int temp = solve(map2.get(item)[i].substring(1));
					
					if(temp == Integer.MAX_VALUE)
						return Integer.MAX_VALUE;

					result += (map2.get(item)[i].charAt(0) - '0') * temp;
					check.put(map2.get(item)[i], 0);
				}
				
			}
			
			for(int i = 0; i < map2.get(item).length; i++)
			{
				check.remove(map2.get(item)[i]);
			}
			check.remove(item);
			
			return result;
		}
		else
		{
			return Integer.MAX_VALUE;
		}
	}

}

