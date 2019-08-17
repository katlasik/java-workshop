public class TryParseExercise {

    /**
     * Napisz metodę `tryParse` parsująca liczbę ze łańcucha znaków, używajac `Integer.parse`. W przypadku nieudanej konwersji rzuć wyjątek `IllegalArgumentException`
     * zawierający stary wyjątek oraz wiadomość "Nieprawidłowa liczba".
     */
    static Integer tryParse(String input) {
        try {
            return Integer.parseInt(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("Nieprawidłowa liczba", e);
        }
    }

}
