package ProLogical;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if(n<=1) {           //(0,1,- value)  it will return it is not a prime
		return false;
		}
		for(int i=2;i<=Math.sqrt(n); i++) { // (13(12) half 6)
			if(n%i==0) {
				return false;
			}
		}
		return true; //print first statement always
	}
	public static void main(String[] args) {
		int n = 0;
		
		if(isPrime(n)) {
			System.out.println(n + "it is a prime");
		}
		else {
			System.out.println( n + "it is  not a prime");
		}
	}
}
