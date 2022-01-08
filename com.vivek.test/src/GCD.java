
public class GCD {

	int hcf(int a, int b) {
		if (a == 0)
			return b;

		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b)
			return hcf(a - b, b);
		return hcf(a, b - a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GCD s = new GCD();

		int num = s.hcf(98, 56);

		System.out.print(num);

	}

}
