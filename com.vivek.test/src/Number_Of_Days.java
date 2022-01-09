import java.util.Scanner;
public class Number_Of_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Date ");
		
		int date = scan.nextInt();
		
		int a = arr[date];
		
		System.out.println(a);
		
		
	}

}
