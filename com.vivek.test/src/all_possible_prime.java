import java.util.Scanner;

public class all_possible_prime {
	boolean flag = false;

	void prime(int n, int n2) {

		for (int i = 2; i <= n / 2 || i <= n2 / 2; ++i)

		{
			if (n % i == 0 || n2 % i == 0)
				flag = true;

			break;

		}

		if (!flag)
			System.out.println("is a prime number ");

		else
			System.out.println("not a prime number ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, flag;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int p = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Second Number ");
		int q = scan1.nextInt();
		all_possible_prime prim = new all_possible_prime();
		prim.prime(p, q);
		for (i = p; i <= q; i++) {
			{
//				if (i == 0 || i == 1)
//					continue;
				flag = 1;

				for (int j = 2; j <= i / 2; ++j) {
					if (i % j == 0) {
						flag = 0;
						break;
					}
				}

				// flag = 1 means i is prime
				// and flag = 0 means i is not prime
				if (flag == 1)
					System.out.println(i);
			}

		}

	}
}
