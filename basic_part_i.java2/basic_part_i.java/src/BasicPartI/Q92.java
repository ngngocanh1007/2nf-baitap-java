package BasicPartI;

import java.util.Arrays;
import java.util.Scanner;

public class Q92 {


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9};
		int i;
		int sochan = 0, sole = 0;
	

		for(i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				sochan++;
			}
			else
			{
				sole++;
			}
		}		
		System.out.println("so chan trong mang = " + sochan);
		System.out.println("so le trong mang = " + sole);
	}}

