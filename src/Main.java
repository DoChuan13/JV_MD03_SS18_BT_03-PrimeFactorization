import model.LazyPrimeFactorization;
import model.OptimizedPrimeFactorization;

public class Main {
    public static void main(String[] args) {
        int number = 121;
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(number);
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(number);
        Thread lazy = new Thread(lazyPrimeFactorization);
        Thread optimized = new Thread(optimizedPrimeFactorization);
        lazy.start();
        optimized.start();
    }
}
