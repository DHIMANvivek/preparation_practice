import java.util.Scanner;

public class Greatest_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, max;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number ");
		a = scan.nextInt();

		Scanner scan2 = new Scanner(System.in);

		System.out.println("Enter Second Number ");
		b = scan2.nextInt();

		Scanner scan3 = new Scanner(System.in);

		System.out.println("Enter Third Number ");
		c = scan3.nextInt();

		if (a > b)
			max = a;
		else
			max = b;
		if (c > max)
			max = c;
		System.out.println("max number is "+max);

	}

}
