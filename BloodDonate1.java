package Logical;

import java.util.Scanner;

public class BloodDonate1 {
	public static void main(String[] args) {
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the value of age:" );
			int age=c.nextInt();
			System.out.println("Enter the value of weight");
				int weight=c.nextInt();
		
	if(age>=18 ){
	if(weight>=50)
	{
		System.out.println ("You are eligible to donate blood");
	}
				else{
	System.out.println("You are not eligible to donate blood");
				}
	 }
	else {
		System.out.println("Age must be greater than 18");
	}

}
}
