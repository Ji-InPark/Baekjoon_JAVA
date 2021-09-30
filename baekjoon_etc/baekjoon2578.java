package baekjoon_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2578 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 해당 숫자를 사회자가 불렀는지 확인하는 boolean 배열
		boolean[] check = new boolean[26];
		// 빙고판으로 사용되는 int 배열
		int[][] bingo = new int[5][5];
		// 결과값 저장하는 변수
		int result = 0;
		
		// 빙고판에 숫자 넣기
		for(int i = 0; i < 5; i++)
		{
			String[] input = br.readLine().split(" ");
			
			for(int j = 0; j < 5; j++)
			{
				bingo[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		Loop:
		for(int i = 0; i < 5; i++)
		{
			String[] input = br.readLine().split(" ");
			
			for(int j = 0; j < 5; j++)
			{
				// 선이 그어진 개수를 세는 변수
				int lines = 0;
				
				// 사회자가 부른 숫자를 true로 바꾸어준다.
				check[Integer.parseInt(input[j])] = true;
				
				// 결과값 + 1
				result++;
				
				// 가로줄, 세로줄 확인하는 과정
				for(int a = 0; a < 5; a++)
				{
					if(check[bingo[a][0]] && check[bingo[a][1]] && check[bingo[a][2]] && check[bingo[a][3]] && check[bingo[a][4]])
						lines++;
					if(check[bingo[0][a]] && check[bingo[1][a]] && check[bingo[2][a]] && check[bingo[3][a]] && check[bingo[4][a]])
						lines++;
				}
				
				// 대각선 2줄 확인하는 과정
				if(check[bingo[0][0]] && check[bingo[1][1]] && check[bingo[2][2]] && check[bingo[3][3]] && check[bingo[4][4]])
					lines++;
				if(check[bingo[0][4]] && check[bingo[1][3]] && check[bingo[2][2]] && check[bingo[3][1]] && check[bingo[4][0]])
					lines++;
				
				// 선이 그어진 줄 수가 3이 넘어가면 반복문 벗어나기
				if(lines >= 3)
					break Loop;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
	}

}
