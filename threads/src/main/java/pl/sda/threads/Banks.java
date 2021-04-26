package pl.sda.threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Napraw aplikację banks, tak by suma stanów kont była zawsze równa 2000.
 *
 */
class Banks {

  static class Account {

    private final String owner;
    private int balance = 0;

    Account(String owner, int initialBalance) {
      this.owner = owner;
      this.balance = initialBalance;
    }

    void updateBalance(int change){
      balance += change;
    }

    public int getBalance() {
      return balance;
    }
  }

  public static void main(String[] args) throws InterruptedException {

    Account a1 = new Account("Krzysztof", 1000);
    Account a2 = new Account("Anna", 1000);

    Random random = new Random();

    ExecutorService ec = Executors.newCachedThreadPool();

    for (int i = 0; i < 100; i++) {
      ec.submit(() -> {
        var fromTomaszToAnna = random.nextBoolean();

        if (fromTomaszToAnna) {
          var amount = random.nextInt(a1.getBalance());
          a1.updateBalance(-amount);
          a2.updateBalance(amount);
        } else {
          var amount = random.nextInt(a2.getBalance());
          a2.updateBalance(-amount);
          a1.updateBalance(amount);
        }
      });
    }

    ec.shutdown();

    ec.awaitTermination(100, TimeUnit.SECONDS);


    System.out.println("Tomasz: " + a1.getBalance());
    System.out.println("Anna: " +  a2.getBalance());

    System.out.println("W sumie: " + (a1.getBalance() + a2.getBalance()));
  }


}