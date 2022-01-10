
import java.util.Scanner;

public class Count_Digits {

	int number(int x) {

		int n = 0;

		while (x > 0) {
			n++;
			x = x / 10;

		}
	
return n;
	}
	
	int number2(int y) {
		
		int s = 0;
		
		while(y>0) {
			s++;
			y = y%10;
		}
		return y;
		
	}
	
	void armstrong(int a , int b ) {
		double m = Math.pow(a,b);

		System.out.println("Power is "+m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		

		System.out.println("Enter the number ");

		int n1 = scan.nextInt();
		
		int a1 = n1%10;
		      
		
		
		Count_Digits a = new Count_Digits();
		int n3 = a.number(n1); 
		a.number(n1);
	
		
		a.armstrong(a1, n3);

	}

}
