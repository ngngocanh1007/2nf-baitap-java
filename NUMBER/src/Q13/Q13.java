package Q13;

import java.util.Scanner;

public class Q13 {
	 public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in);
      System.out.print("numbers : ");
      int a = sc.nextInt();
      int p = 0;
  
      for(int i=0; i<a; i++)
      {
          if(i*(i+1) == a)
          {
              p = 1;
              break;
          }
      }
       
      if(p == 1)
          System.out.println("so pronic");
      else
          System.out.println("k phai so pronic.");      
  }

}
