package Logical;

import java.util.Scanner;

public class Mark2 {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the value of k:" );
			int mark=c.nextInt();
		if(mark>=85) {
			System.out.println("very good");
		}
		
	    else if(mark>=70){  
	        System.out.println("good");
	}
	    else if(mark>=50 ){  
	        System.out.println("average");  
	    }  	
	    else {
	    	System.out.println("fail");
	    }
}
}