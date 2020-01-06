public class CheckNullExercise {

    /**
     * Napisz metodę `checkNull` rzucającą wyjątek `NullPointerException`, gdy argument jest równy `null`.
     * <p>
     * Napisz następnie metodę `checkSize` sprawdzającą czy podany łańcuch znaków ma długość dłuższą lub równą od 2 znaków i krótszą lub równą od 15.
     * Jeżeli rozmiar jest nieprawidłowy to zgłoś wyjątek `IllegalArgumentException` z wiadomością
     * *"Tekst musi mieć od 2 do 15 znaków, a ma X znaków"*, gdzie X to rzeczywisty rozmiar tekstu.
     * <p>
     * Dodaj metodę `validate`, przyjmującą łańcuch znaków i zwracającą `boolean`. Ta metoda powinna wywołać metody
     * `checkNull` oraz `checkSize`. Jeżeli nie zostanie z nich rzucony żaden wyjątek, to metoda
     * powinna zwrócić `true`, jeżeli zostanie rzucony jakikolwiek wyjątek, to powinien zostać wypisany
     * za pomocą `System.err.println`, a metoda powinna zwrócić `false`.
     * <p>
     * Napisz metodę `main` w której przetestujesz jak zachowuje się metoda `validate` dla prawidłowych
     * wartości, jak *"Test"* oraz nieprawidłowych jak `null` lub *"x"* albo *"xxxxxxxxxxxxxxxxx"*.
     */
    static void checkNull(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
    }

    static void checkSize(String text) {
        if (text.length() < 2 || text.length() > 15) {
            throw new IllegalArgumentException("Tekst musi mieć od 2 do 15 znaków, a ma " + text.length() + " znaków");
        }
    }

    static boolean validate(String text) {
        try {
            checkNull(text);
            checkSize(text);
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(validate("ok"));
        System.out.println(validate(null));
        System.out.println(validate(""));
        System.out.println(validate("x"));
        System.out.println(validate("xxxxxxxxxxxxxxxx"));
    }


}
