import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, intvar;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number ");
		n = scan.nextInt();

		double floatvar = Math.sqrt((double) n);
		intvar = (int)floatvar;
		if (intvar == floatvar)
			System.out.println("Success");
		else
			System.out.println("Failure");

	}

}
