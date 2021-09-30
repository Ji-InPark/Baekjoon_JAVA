package baekjoon_basic_math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class baekjoon10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input_string = new String[2];
		input_string = br.readLine().split(" ");
		
		String num1 = "", num2 = "", result = "";
		
		for(int i = input_string[0].length() - 1; i >= 0; i--)
		{
			num1 += input_string[0].charAt(i) - 48;
		}
		
		for(int i = input_string[1].length() - 1; i >= 0; i--)
		{
			num2 += input_string[1].charAt(i) - 48;
		}

		int carry = 0;
		
		if(num1.length() == num2.length())
		{
			for(int i = 0; i < num1.length(); i++)
			{
				int temp_num = num1.charAt(i) + num2.charAt(i) - 96;
				
				if(temp_num + carry >= 10)
				{
					result += (temp_num + carry) % 10;
					carry = 1;
				}
				else
				{
					result += (temp_num + carry);
					carry = 0;
				}
			}
			
			if(carry == 1)
			{
				result += 1;
			}
		}
		else
		{
			if(num1.length() > num2.length())
			{
				for(int i = 0; i < num2.length(); i++)
				{
					int temp_num = num1.charAt(i) + num2.charAt(i) - 96;
					
					if(temp_num + carry >= 10)
					{
						result += (temp_num + carry) % 10;
						carry = 1;
					}
					else
					{
						result += (temp_num + carry);
						carry = 0;
					}
				}
				
				for(int i = num2.length(); i < num1.length(); i++)
				{
					int temp_num = num1.charAt(i) - 48;
					
					if(temp_num + carry >= 10)
					{
						result += (temp_num + carry) % 10;
						carry = 1;
					}
					else
					{
						result += (temp_num + carry);
						carry = 0;
					}
				}
				
				if(carry == 1)
				{
					result += 1;
				}
			}
			else
			{
				for(int i = 0; i < num1.length(); i++)
				{
					int temp_num = num1.charAt(i) + num2.charAt(i) - 96;
					
					
					if(temp_num + carry >= 10)
					{
						result += (temp_num + carry) % 10;
						carry = 1;
					}
					else
					{
						result += (temp_num + carry);
						carry = 0;
					}
				}
				
				for(int i = num1.length(); i < num2.length(); i++)
				{
					int temp_num = num2.charAt(i) - 48;
					
					if(temp_num + carry >= 10)
					{
						result += (temp_num + carry) % 10;
						carry = 1;
					}
					else
					{
						result += (temp_num + carry);
						carry = 0;
					}
				}
				
				if(carry == 1)
				{
					result += 1;
				}
			}
		}
		
		for(int i = 0; i < result.length(); i++)
		{
			bw.write(result.charAt(result.length() - 1 - i) - 48 + "");
		}
		bw.flush();
	}

}
