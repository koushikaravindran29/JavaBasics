package Logical;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of k:" );
		int k =sc.nextInt();
		if(((k % 4 ==0) && (k % 100 !=0)) || (k % 400==0)){ 
   //if (k % 4 == 0) {
        System.out.println("it is  a leap year");
        } else {
            System.out.println(k + " is not a leap year");
        }
    
}
}
	