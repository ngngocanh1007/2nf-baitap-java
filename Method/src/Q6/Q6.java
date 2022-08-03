package Q6;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("dau vao: ");
      int digits = in.nextInt();
	  System.out.println("tong la " + sumDigits(digits));
    }

 public static int sumDigits(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}


}
