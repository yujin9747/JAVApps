/**
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 3003번 문제
 * Stage 1 - 9
 * 
 * https://www.acmicpc.net/problem/3003
 * 
 * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
 * 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
 * */
package chess;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pieces[] = {1, 1, 2, 2, 2, 8};
		int have;
		for(int i=0; i<6; i++) {
			have = in.nextInt();
			System.out.printf("%d ",pieces[i]-have);
		}
		in.close();
	}
}
