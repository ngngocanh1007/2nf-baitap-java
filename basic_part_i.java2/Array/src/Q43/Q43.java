package Q43;

import java.util.Scanner;

public class Q43 {
	
	
	public static void main(String[] args) {
		hamtinhtong tong = new hamtinhtong();
		int A[]= {10,20,30,40,1,2};
		int n = A.length ;
		int X;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tong X: ");
		X=sc.nextInt();
		tong.hamtinhtong(A, n, X);
		
	}

}
