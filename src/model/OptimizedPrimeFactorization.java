package model;

public class OptimizedPrimeFactorization implements Runnable {
    private int number;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean checkPrime = checkPrime(number);
        if (checkPrime) {
            System.out.println(number + " is Prime Number (via Optimized)");
        } else
            System.out.println(number + " is NOT Prime Number (via Optimized)");
    }

    private boolean checkPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
