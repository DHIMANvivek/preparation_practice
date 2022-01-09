import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, rows, column;

		Scanner scan = new Scanner(System.in);

		System.out.println("ENTER ROWS");

		rows = scan.nextInt();

		Scanner scan2 = new Scanner(System.in);

		System.out.println("ENTER COLUMN");

		column = scan2.nextInt();

		for (i = 1; i <= rows; i++) {

			for (j = 1; j <= column; j++) {
				if (i == 1 || i == rows || j == 1 || j == column)
					System.out.println("1");
				else
					System.out.println("0");

			}
			System.out.print("\n"); 
		}
	
	}

}
