package timecomplexity;
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        // A prime number has no divisors other than 1 and itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break; // Not a prime
            }
        }

        System.out.println(num + " is prime: " + isPrime);
    }
}
