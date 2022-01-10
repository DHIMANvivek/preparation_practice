import java.util.Scanner;

public class Print_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  1
//  2*2
//  3*3*3
//  4*4*4*4
//  4*4*4*4
//  3*3*3
//  2*2
//  1
		Scanner sc = new Scanner(System.in); // Taking rows value from the user
		System.out.println("Enter the number of rows: ");
		int i, j, rows;
		rows = sc.nextInt();
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(i + "*");
			System.out.print(i);
			System.out.println();
		}

		for (i = rows; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--)
				System.out.print(i + "*");
			System.out.print(i);
			System.out.println();

		}

	}
}