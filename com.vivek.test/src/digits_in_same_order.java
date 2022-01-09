import java.util.Scanner;

public class digits_in_same_order {

	void printDigit(int N) {

		int r;

		if (N == 0)
			return;

		r = N % 10;
		printDigit(N / 10);
		System.out.println(r+" ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scan.nextInt();

		digits_in_same_order s = new digits_in_same_order();

		s.printDigit(n);

	}

}
