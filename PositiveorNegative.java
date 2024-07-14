package Logical;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the value of k:" );
			int k =c.nextInt();
			if(k<0) {
				System.out.println("it is negative");
			}
			else {
				System.out.println("it is positive");
			}
	}

}
