/**
 * A+B
 * 1000번 문
 * Stage 1 - 2
 * 
 * https://www.acmicpc.net/problem/1000
 * 
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
package aPlusb;
import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int sum = userInput.nextInt();
		sum += userInput.nextInt();
		
		System.out.println(sum);
		userInput.close();
	}

}
