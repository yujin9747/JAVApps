/**
 * 사칙연산
 * 10869번 문제
 * Stage 1 - 6
 * 
 * https://www.acmicpc.net/problem/10869
 * 
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 * */
package arithmeticOp;
import java.util.Scanner;

public class ArithmeticOP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		in.close();
		
		System.out.printf("%d\n", A+B);
		System.out.printf("%d\n", A-B);
		System.out.printf("%d\n", A*B);
		System.out.printf("%d\n", A/B);
		System.out.printf("%d\n", A%B);

	}

}
