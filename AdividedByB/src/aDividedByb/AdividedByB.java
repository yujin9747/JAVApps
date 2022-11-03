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
