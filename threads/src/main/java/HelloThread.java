/**
 * Stwórz nowy wątek wyświetlający napis `Witaj z innego wątku!` co 10 sekund oraz dodaj pętlę
 * w głownym wątku wyświetljącą `Witaj z głownego wątku!` co 20 sekund.
 */

public class HelloThread {

    static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Thread(() -> {
            while(true) {
                System.out.println("Witaj z innego wątku.");
                sleep(10_000);
            }
        }).start();

        while (true) {
            System.out.println("Witaj z głównego wątku.");
            sleep(20_000);
        }
    }


}
