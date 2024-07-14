package ProLogical;
public class Palindrome {

	public static void main(String[] args) {
		int sum=0;
		int n=89898;
		
		int temp=n;
		
		while(n>0) {
			int r=n%10;
	 sum= (sum*10)+r;
	 n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}

}
