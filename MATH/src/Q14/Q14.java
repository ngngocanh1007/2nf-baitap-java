package Q14;

import java.util.Scanner;

public class Q14 {
	 public static float square_Root(float num) 
	    { 
	        float a = num; 
	        float b = 1; 
	        double e = 0.000001; 
	        while (a - b > e) { 
	            a = (a + b) / 2; 
	            b = num / a; 
	        } 
	        return a; 
	    } 
	 
	   public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("so nguyen nhap vao: ");
	        int num = scan.nextInt();
	        scan.close(); 
			System.out.println("can bac 2 cua mot so babylon: "+square_Root(num));		
			}

}
