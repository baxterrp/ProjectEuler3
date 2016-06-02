class DoMath {
	public void getFactors(long number) {
		for (long i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}

	public boolean isPrime(long number) {
		boolean prime = true;
		for (long i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}

public class App {

	public static void main(String[] args) {
		DoMath myMath = new DoMath();
		myMath.getFactors(600851475143l);
	}

}