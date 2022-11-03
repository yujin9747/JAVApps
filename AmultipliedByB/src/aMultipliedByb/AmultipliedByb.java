/**
 * A*B
 * 10998번 문제
 * Stage 1 - 4
 * 
 * https://www.acmicpc.net/problem/10998
 * 
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 * */
package aMultipliedByb;
import java.util.Scanner;

public class AmultipliedByb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mul = in.nextInt();
		mul *= in.nextInt();
		
		in.close();
		
		System.out.print(mul);

	}

}
