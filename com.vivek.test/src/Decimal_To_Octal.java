
public class Decimal_To_Octal {

	static void toOctal(int num) {
		StringBuilder s = new StringBuilder();
		
		int a = 0;
		while(num>0) {
			
			s.append(num%8);
			a++;
			num = num/8;
			
		}
		System.out.println(s.reverse());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num = 33;
	
	Decimal_To_Binary s1 = new Decimal_To_Binary();
	
	toOctal(num);
		
		

	}

}
