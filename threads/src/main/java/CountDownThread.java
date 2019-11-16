/**
 * Stwórz klasę dziedziczącą po `Runnable`, która jako parametr otrzyma liczbę. Zadaniem obieku tej
 * klasy będzie wyświetlenie liczby razem z z nazwą watku, a następnie odczekanie 1 sekundy i zmniejszenie wartości
 * o 1, a natępnie powtórzenie operacji aż do osiągnięcia 0. Innymi słowy należe odliczyć od n do 0.
 */

class DownCounter implements Runnable{

    private int n;

    public DownCounter(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        while(n > 0) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }

            System.out.println(Thread.currentThread().getName() + ": " + n-- + ".");
        }
    }
}

public class CountDownThread {

    public static void main(String[] args) {
        System.out.println("Witaj z głównego wątku:"+ Thread.currentThread().getName() +".");
        new Thread(new DownCounter(10)).start();
        new Thread(new DownCounter(10)).start();
        new Thread(new DownCounter(10)).start();
        new Thread(new DownCounter(10)).start();
    }

}