import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number ");
		a = scan.nextInt();

		while (a > 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}

		System.out.println(sum);

	}

}
