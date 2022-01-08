import java.util.Scanner;

public class area_of_circle {

	static class area {

		 double circle(double d) {
			 
double r  = d/2;
double pie = 3.14;

			double area_circle = pie*(r*r);
			return area_circle;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		area c = new area();
		
		double answer  = c.circle(5);
		
		System.out.print(answer);

	}
}