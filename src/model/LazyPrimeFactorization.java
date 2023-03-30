package model;

public class LazyPrimeFactorization implements Runnable {
    private int number;

    public LazyPrimeFactorization(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean checkPrime = checkPrime(number);
        if (checkPrime) {
            System.out.println(number + " is Prime Number (via Lazy)");
        } else
            System.out.println(number + " is NOT Prime Number (via Lazy)");
    }

    private boolean checkPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
