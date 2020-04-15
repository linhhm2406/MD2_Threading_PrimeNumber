public class Main {
    public static void main(String[] args) {

    LazyPrimeFactorization lz = new LazyPrimeFactorization();
    OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();

    Thread lazy = new Thread(lz);
    Thread opt = new Thread(op);

    lazy.start();
    opt.start();
    }
}
