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
