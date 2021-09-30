package baekjoon_sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		List<person> arr = new ArrayList();
		
		for(int i = 0; i < N; i++)
		{
			String[] input = br.readLine().split(" ");
			arr.add(new person(Integer.parseInt(input[0]), input[1], i));
		}
		
		Collections.sort(arr);
		
		
		for(int i = 0; i < N; i++)
		{
			bw.write(arr.get(i).age + " " + arr.get(i).name + "\n");
		}
		bw.flush();
	}

}

class person implements Comparable<person>
{
	public int age, prio;
	public String name;
	
	public person(int age, String name, int prio)
	{
		this.age = age;
		this.name = name;
		this.prio = prio;
	}

	@Override
	public int compareTo(person o) {
		
		if(this.age == o.age)
		{
			return this.prio - o.prio;
		}
		else
			return this.age - o.age;

	}
}
