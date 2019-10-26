public class CheckNullExercise {

    /**
     *  Napisz metodę `checkNull` rzucającą wyjątek `NullPointerException`, gdy argument jest równy `null`.
     *
     *  Napisz następnie metodę `checkSize` sprawdzającą czy podany łańcuch znaków ma długość dłuższą lub równą od 2 znaków i krótszą lub równą od 15.
     *  Jeżeli rozmiar jest nieprawidłowy to zgłoś wyjątek `IllegalArgumentException` z wiadomością
     *  *"Tekst musi mieć od 2 do 15 znaków, a ma X znaków"*, gdzie X to rzeczywisty rozmiar tekstu.
     *
     *  Dodaj metodę `validate`, przyjmującą łańcuch znaków i zwracającą `boolean`. Ta metoda powinna wywołać metody
     *  `checkNull` oraz `checkSize`. Jeżeli nie zostanie z nich rzucony żaden wyjątek, to metoda
     *  powinna zwrócić `true`, jeżeli zostanie rzucony jakikolwiek wyjątek, to powinien zostać wypisany
     *  za pomocą `System.err.println`, a metoda powinna zwrócić `false`.
     *
     *  Napisz metodę `main` w której przetestujesz jak zachowuje się metoda `validate` dla prawidłowych
     *  wartości, jak *"Test"* oraz nieprawidłowych jak `null` lub *"x"* albo *"xxxxxxxxxxxxxxxxx"*.
     */
    static void checkNull(Object o) {

    }

    static void checkSize(String text) {

    }

    static boolean validate(String text) {
        return false;
    }

    public static void main(String[] args) {

    }


}
