package baekjoon_function;

public class baekjoon15596 {
	
	public static long sum(int[] a)
	{
		long result = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			result += a[i];
		}
		
		return result;
	}

}
