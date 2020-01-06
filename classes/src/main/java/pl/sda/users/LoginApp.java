package pl.sda.users;


import java.util.Scanner;

/**
 * Stwórz klasę `User`, zawierającą pola typu `String` `password`, `username` oraz `secret`. Stwórz dla niej konstruktor oraz klasy dostępowe. Stwórz konstruktor, który ustawia tylk `username` i `password`, a dla `secret` ustawia *"---"*.
 * Do klasy `User` dodaj metodę `boolean authenticate(String username, String password)`. Metoda powinna zwrócić `true` w przypadku, gdy zostanie wywołana z hasłem i nazwą użytkownika zgadzającą się z tymi przechowywanumi w obiekcie.  Dodaj także drugą metodę `boolean authenticate(String secret)`, która zwróci `true`, gdy podany parametr jest taki sam jak w polu `secret`, ale nigdy gdy pole `secret` zawiera *"---"*.
 * Stwórz klasę `LoginApp`. Dodaj do niej statyczne pole-tablicę zawierającą 5 obiektów `user`.
 * Dodaj metodę `main`, która wyświetli komunikat dla użytkownika by wpisał login i hasło oraz wczyta te dane. Następnie przeszukaj tablicę obiektów szukając użytkownika, którego metoda `authenticate` zwróci `true` dla pary nazwa użytkownika-hasło.
 * Jeżeli znajdziesz pasujący obiekt, to wyświetl komunikat *"Witaj <nazwa użytkownika>!"* i zakończ program. Jeżeli nie uda się znaleźć pasującego obiektu, to poinformuj użytkownika i ponownie wyświetl komunikat z prośbą o wpisanie hasła.
 * (Opcjonalnie) Dodaj możliwość wyboru zalogowania się poprzez tajny token.
 * Stwórz klasę `Administrator`, która dziedziczy po po klasie `User`. Dodaj metodę `void confirmWithMFA()` dla klasy `Administrator`,
 * która wyświetla na konsolę tekst *"Wysyłam SMS z kodem dostępu..."*. Przesłoń obydwie metody `authenticate` dla klasy `Administrator`, tak by zawsze wywoływały metodę `confirmWithMFA`. Dodaj obiekt klasy `Administrator` do tablicy użytkowników oraz spróuje się na niego zalogować.
 */

public class LoginApp {

    private static User[] users = {
            new User("pass", "admin", "token"),
            new User("passw0rd", "adam", "token"),
            new User("qwerty", "romek", "token"),
            new User("razdwa", "aga", "token"),
            new User("pass", "pati", "token"),
            new Administrator("admin", "admin")
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean authenticated = false;

        while (!authenticated) {

            System.out.println("Witaj, podaj nazwę użytkownika:");
            String username = scanner.nextLine();
            System.out.println("Podaj hasło:");
            String password = scanner.nextLine();

            for (int i = 0; i < users.length; i++) {
                User user = users[i];
                if (user.authenticate(username, password)) {
                    System.out.println("Witaj, " + username + "!");
                    authenticated = true;
                    break;
                }
            }

        }

    }


}
