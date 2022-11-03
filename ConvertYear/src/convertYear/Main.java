/**
 * 1998년생인 내가 태국에서는 2541년생?!
 * 18108번 문제
 * Stage 1 - 8
 * 
 * https://www.acmicpc.net/problem/18108
 * 
 * 입력: 불기 연도  
 * 출력: 서기 연도  
 * */
package convertYear;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		int year = in.nextInt();
		in.close();
		year -= 543;
		
		System.out.print(year);

	}

}
