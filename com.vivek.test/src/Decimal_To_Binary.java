import java.util.Scanner;
public class Decimal_To_Binary {
	   static void toBinary(int num)
	   { 
	      StringBuilder sb = new StringBuilder(); 
	      int a = 0;
	      while(num > 0)
	      {
	         sb.append(num % 2);
	         a++;
	         num = num / 2;
	      }
	      System.out.println(sb.reverse()); 
	   }
	   public static void main(String[] args) 
	   {
	      int number = 33; 
	      toBinary(number);
	   }
	}