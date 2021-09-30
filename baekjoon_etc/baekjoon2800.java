package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class baekjoon2800 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		
		String[] input = br.readLine().split("");
		boolean[] check = new boolean[input.length];
		
		Arrays.fill(check, true);
		
		Stack<Integer> q = new Stack<Integer>();
		
		ArrayList<pair_3> list = new ArrayList<pair_3>();
		
		for(int i = 0; i < input.length; i++)
		{
			if(input[i].equals("("))
			{
				q.add(i);
			}
			else if(input[i].equals(")"))
			{
				pair_3 temp_pair = new pair_3(q.pop(), i);
				list.add(temp_pair);
				cnt++;
			}
		}
		
		list.sort(new Comparator<pair_3>() {

			@Override
			public int compare(pair_3 o1, pair_3 o2) {
				
				return o2.left - o1.left;
			}
			
		});
		
		cnt = (int)Math.pow(2, cnt) - 2;
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		String result = "";
		
		ArrayList<String> result_list = new ArrayList<String>();
		
		for(int i = cnt; i >= 0; i--)
		{
			int temp = i;
			
			for(int j = 0; j < list.size(); j++)
			{
				if(temp % 2 == 1)
				{
					check[list.get(j).left] = true;
					check[list.get(j).right] = true;
				}
				else
				{
					check[list.get(j).left] = false;
					check[list.get(j).right] = false;
				}
				
				temp /= 2;
			}
			
			result = "";
			for(int j = 0; j < input.length; j++)
			{
				if(check[j])
					result += input[j];
			}
			
			if(!map.containsKey(result))
			{
				map.put(result, result);
				result_list.add(result);
			}
		}
		
		result_list.sort(null);
		
		for(int i = 0; i < result_list.size(); i++)
		{
			bw.write(result_list.get(i) + "\n");
		}
		
		bw.flush();
	}
	
	

}

class pair_3
{
	int left;
	int right;
	
	public pair_3(int left, int right)
	{
		this.left = left;
		this.right = right;
	}
}
