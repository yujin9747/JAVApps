/**
 * A-B
 * 1001번 문제
 * Stage 1 - 3
 * 
 * https://www.acmicpc.net/problem/1001
 * 
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 */
package aMinusb;
import java.util.Scanner;

public class AminusB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// get user inputs and calculate them
		int minus = in.nextInt();
		minus -= in.nextInt();
		
		in.close();	// close Scanner
		
		System.out.print(minus); // print the result

	}

}
