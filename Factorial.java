package Logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the value of n:" );
			int n=c.nextInt();
		
		for( i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("sum of the value is \t" +fact);
	}

}
