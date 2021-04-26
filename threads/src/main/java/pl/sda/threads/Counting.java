package pl.sda.threads;

/**
 * Napraw klasę Counter tak by wynik zawsze był poprawny. Zastosuj synchronizację.
 */
class Counting {

  static class Counter {

    private int counter = 0;

    void inc() {
      counter++;
    }

    void dec() {
      counter--;
    }

    public int getCounter() {
      return counter;
    }
  }

  static class Incrementer1000 implements Runnable {
    private final Counter counter;

    Incrementer1000(Counter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        counter.inc();
      }
    }
  }

  static class Decrementer1000 implements Runnable {
    private final Counter counter;

    Decrementer1000(Counter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        counter.dec();
      }
    }
  }


  public static void main(String[] args) {
    try {
      Counter c = new Counter();

      Thread t1 = new Thread(new Incrementer1000(c));
      Thread t2 = new Thread(new Decrementer1000(c));
      Thread t3 = new Thread(new Incrementer1000(c));

      t1.start();
      t2.start();
      t3.start();

      t1.join();
      t2.join();
      t3.join();

      System.out.println(c.getCounter());
    } catch (InterruptedException e) {
      System.out.println("Interrupted!");
    }
  }
}