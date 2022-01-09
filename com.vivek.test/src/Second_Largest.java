import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number ");
		a = scan.nextInt();

		Scanner scan2 = new Scanner(System.in);

		System.out.println("Enter Second Number ");
		b = scan2.nextInt();

		Scanner scan3 = new Scanner(System.in);

		System.out.println("Enter Third Number ");
		c = scan3.nextInt();

		if (a >= b && a >= c) {
			if (b >= c)
				System.out.println(b);
			else
				System.out.println(c);
		} else if (b >= a && b >= c) {

			if (a >= c)
				System.out.println(a);
			else
				System.out.println(b);

		} else if (c >= a && c >= b) {

			if (a >= b)
				System.out.println(a);
			else
				System.out.println(b);
		}

	}

}
