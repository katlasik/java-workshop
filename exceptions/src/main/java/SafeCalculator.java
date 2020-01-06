import java.util.ArrayList;
import java.util.Scanner;

public class SafeCalculator {

    /**
     * Stwórz kalkulator bezpiecznie wczytujący liczby i dodającą je listy.
     * Po wpisaniu przez użytkownika `=` program powinien wyświetlić liczby oraz sumę.
     * <p>
     * * Jeżeli liczba jest poprawna, np. *123* to powinna zostać dodana do listy.
     * * Jeżeli liczba jest niepoprawna, to wyjątek *InputMismatchException* powinien zostać przechwycony i
     * powienien zostać wyświetlony komunikat "Niepoprawna liczba!". Podanie niepoprawnej liczby nie powinno
     * kończyć działania programu.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String line = scanner.next();

            if (line.equals("=")) {
                System.out.println("Suma liczb " + gather(numbers) + " to: " + sum(numbers));
                break;
            } else {
                try {
                    int i = Integer.parseInt(line);
                    numbers.add(i);
                } catch (NumberFormatException e) {
                    System.err.println("Nieprawidłowa liczba");
                }
            }
        }


    }

    private static String gather(ArrayList<Integer> numbers) {
        String result = "";
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
            if (i < numbers.size() - 1) {//dodaj przecinek zawsze, oprócz ostatniego razu
                result += ",";
            }
        }
        return result;
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

}
