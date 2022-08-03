package Q19;

import java.math.BigInteger;
import java.util.Scanner;

public class Q19 {
	 public static void main( String args[] ){ 
         Scanner sc = new Scanner( System.in ); 
         System.out.print("numbers: "); 
         String strnum = sc.nextLine().trim();
         BigInteger n = new BigInteger(strnum);
         int len = strnum.length()+1;
         String str = String.valueOf(len);
         BigInteger n1 = new BigInteger(str);
         StringBuilder buf = new StringBuilder();
         for(int i = 0 ; i < (len-1); i++) {
             buf.append('9');
         }
         BigInteger total = new BigInteger(buf.toString());
         if(n.multiply(n1).equals(total)) {
             System.out.println("la so tuan hoan.");
         }
         else {
             System.out.println("khong phai la so tuan hoan.");
         }                    
     }

}
