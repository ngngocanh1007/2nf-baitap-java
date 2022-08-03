package Q18;

import java.util.Iterator;
import java.util.Scanner;

public class Q18 {
	static int count_nums_not_7(int num) 
    { 
        if (num < 7) 
            return num; 
        if (num >= 7 && num < 10) 
            return num-1; 
 
        int r = 1; 
        while (num/r > 9) 
            r = r*10; 
  
        int m = num/r; 
   
        if (m != 7) 
            return count_nums_not_7(m)*count_nums_not_7(r - 1) + count_nums_not_7(m) + count_nums_not_7(num%r); 
        else
            return count_nums_not_7(m*r - 1); 
    } 
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scan.nextInt();
		if (num>0)
		System.out.println("Count the numbers without digit 7, from 1 to "+num+": "+count_nums_not_7(num));		
		}

}
