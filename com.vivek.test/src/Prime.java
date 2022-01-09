import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		boolean flag = false;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0)
				flag = true;
			break;
		}

		if (!flag) {
			System.out.println("is a prime number " + num);
		} else
			System.out.println("is not a prime number " + num);
	}

}
