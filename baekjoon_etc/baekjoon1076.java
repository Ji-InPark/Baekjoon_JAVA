package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class baekjoon1076 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("black", 0);
		map.put("brown", 1);
		map.put("red", 2);
		map.put("orange", 3);
		map.put("yellow", 4);
		map.put("green", 5);
		map.put("blue", 6);
		map.put("violet", 7);
		map.put("grey", 8);
		map.put("white", 9);
		
		long result = map.get(br.readLine());
		
		result *= 10;
		
		result += map.get(br.readLine());
		
		result *= (long)Math.pow(10, map.get(br.readLine()));
		
		
		bw.write(result + "\n");
		bw.flush();
		
	}

}
