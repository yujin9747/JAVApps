/**
 * 나머지
 * 10430번 문제
 * Stage 1 - 9
 * 
 * https://www.acmicpc.net/problem/10430
 * 
 * 첫째 줄에 (A+B)%C, 
 * 둘째 줄에 ((A%C) + (B%C))%C, 
 * 셋째 줄에 (A×B)%C, 
 * 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 * */
package remainder;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);

	}

}
