package ProLogical;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=371,originalnumber,remainder,result=0;
				originalnumber=n;
		while(originalnumber !=0) {
			remainder =originalnumber%10;
			result += Math.pow(remainder,3);
			originalnumber /= 10;
		}
		if(result==n)
		{
			System.out.println(n +"is an armstrong");
					
		}
		else {
			System.out.println(n +"is not an armstrong");
		}
	}

}
