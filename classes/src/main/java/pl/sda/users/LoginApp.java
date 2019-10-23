package pl.sda.users;

import java.util.Scanner;

/**
 * Stwórz klasę `User`, zawierającą pola typu `String` `password`, `username`. Stwórz dla niej konstruktor oraz klasy dostępowe.
 * Stwórz klasę `LoginApp`. Dodaj w niej statyczne pole-tablicę zawierającą 5 obiektów `user`.
 * Dodaj metodę `main`, która wyświetli komunikat dla użytkownika by wpisał login i hasło oraz wczyta te dane. Następnie przeszukaj tablicę obiektów szukając pasującej nazwy użytkownika i hasła.
 * Jeżeli znajdziesz pasujący obiekt, to wyświetl komunikat *"Witaj <nazwa użytkownika>!"* i zakończ program. Jeżeli nie uda się znaleźć pasującego
 * obiektu, to poinformuj użytkownika i ponownie wyświetl komunikat o wpisaniu hasła.
 */
public class LoginApp {

    static User[] users = new User[]{
            new User("pass", "admin"),
            new User("passw0rd", "adam"),
            new User("qwerty", "romek"),
            new User("razdwa", "aga"),
            new User("pass", "pati")
    };


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj login:");
            String username = scanner.next();
            System.out.println("Podaj hasło:");
            String password = scanner.next();


            for (User user : users) {
                if (user.getPassword().equals(password) && user.getUser().equals(username)) {
                    System.out.println("Witaj " + username + "!");
                    return;
                }
            }

            System.out.println("Nie udało się zalogować.");
        }


    }


}
