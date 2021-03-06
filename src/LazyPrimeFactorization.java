public class LazyPrimeFactorization implements Runnable {
    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public synchronized void run() {
        for (int i = 3; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(Thread.currentThread().getName()+ " " + i);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("abc");

    }

}
