/**
 * A/B
 * 1008번 문제
 * Stage 1 - 5
 * 
 * https://www.acmicpc.net/problem/1008
 * 
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * */
package aDividedByb;
import java.util.Scanner;

public class AdividedByB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double div = in.nextInt();
		div /= in.nextInt();
		
		in.close();
		
		System.out.print(div);

	}

}
