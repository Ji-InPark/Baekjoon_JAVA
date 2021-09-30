package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon3151 {
	// n 저장(글로벌로 씀)
	public static int n;
	// 입력 저장할 배열, 중복되는 수의 가장 처음 나오는 index 저장하는 배열, 수의 중복 개수를 저장할 배열
	public static int[] arr, location, cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// n 입력 받음
		n = Integer.parseInt(br.readLine());

		// 저장할 배열을 n + 1의 크기를 할당(처리 편하게 할려고 크게 잡는 것임)
		arr = new int[n + 1];
		
		// 위치와 중복을 저장할 배열을 200005의 크기를 할당 (배열에는 음수의 인덱스가 없으므로 10000을 0이라고 치고 계산하기 위해서 그런 것, 이것 또한 처리하기 편하게 크게 잡음)
		location = new int[20005];
		cnt = new int[20005];
		
		// 0 개수를 저장함
		int zero = 0;
		
		// 입력 받음
		String[] input = br.readLine().split(" ");
		
		// int형으로 캐스팅하면서 0의 개수 및 수의 중복 개수도 저장
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(input[i]);
			if(arr[i] == 0)
				zero++;
			cnt[10000 + arr[i]]++;
		}
		// 배열을 1크게 잡았으므로 한 칸이 남게 되는데 기본적으로 0이 저장되어 있다. 이 상태로 정렬을 하게 되면
		// 원하지 않는 0이 섞여서 저장되게 되므로 이 값을 입력으로 받을 수 없는 큰 값으로 만들어서
		// 맨 오른쪽에 위치하게끔 해주는 작업이다.
		arr[n] = 20000;
		
		// 오름차순으로 정렬을 해준다.
		Arrays.sort(arr);
		
		
		// 중복되는 수가 처음 나오는 인덱스를 저장하기 위한 작업
		int pre = arr[0];
		location[10000 + arr[0]] = 0;
		for(int i = 1; i < n; i++)
		{
			if(pre != arr[i])
			{
				pre = arr[i];
				location[10000 + arr[i]] = i;
			}
		}
		
		// 결과를 저장할 변수
		long result = 0;
		
		// 첫번째로 선택할 수는 arr[i], 음수에서만 선택한다.
		for(int i = 0; i < n && arr[i] < 0; i++)
		{
			// 두번째로 선택할 수는 arr[j], i + 1 부터 선택한다.
			for(int j = i + 1; j < n; j++)
			{
				// 두 값의 합이 음수라면
				if(arr[i] + arr[j] < 0)
				{
					// 두 값의 합과 더했을 때 0이 되는 수를 구해준다.
					int num = -1 * (arr[i] + arr[j]);
					// 이진탐색으로 해당하는 수가 인덱스 j+1부터 배열의 끝까지 존재하는 확인한다.
					if(search(num, j + 1))
					{
						// 존재한다면 그 수가 처음 나오는 인덱스가 3번째로 선택할 수 있는 인덱스보다 작은지 확인한다
						// 작다면
						if(location[10000 + num] < j + 1)
						{
							// (수의 중복 개수 + 수의 인덱스 위치 - 3번째로 선택할 수 있는 인덱스)를 결과값에 더해준다.
							result += cnt[10000 + num] + location[10000 + num] - j - 1;
						}
						// 크다면
						else
						{
							// 결과값에 수의 중복 개수를 더해준다.
							result += cnt[10000 + num];
						}
					}
				}
				else
				{
					break;
				}
			}
		}
		
		// 0이 3개 이상 나왔다면
		if(zero >= 3)
			// 조합 공식을 사용하여 결과값에 더해준다.
			result += combination(zero);
		
		bw.write(result + "\n");
		bw.flush();
	}
	
	// 조합 함수
	public static long combination(int zero)
	{
		// (0의 개수 C 3)의 값을 리턴한다.
		return zero * --zero * --zero / 1 / 2 / 3;
	}
	
	// 이진 탐색, 찾을 값과 탐색해야하는 인덱스를 파라매터로 받는다.
	public static boolean search(int num, int index)
	{
		// index부터 탐색을 한다.
		int left = index, right = n - 1, middle;
		
		while(left <= right)
		{
			middle = (left + right) / 2;
			
			if(arr[middle] == num)
			{
				return true;
			}
			else if(arr[middle] > num)
			{
				right = middle - 1;
			}
			else
			{
				left = middle + 1;
			}
		}
		
		return false;
	}

}
