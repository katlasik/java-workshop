package pl.sda.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wczytaj plik `osoby` zawierający numery PESEL i nazwiska oraz imiona, podzielone znakiem **|**, a następnie `adresy`
 * zawierający numery PESEl i adresy zamieszkania podzielone znakiem **|**. Połącz dane z obydwóch plików i wyświetl dla wszystich osób
 * dane w formacie *PESEL, imię, nazwisko, adres*. Jeżeli dla danej osoby nie istnieje linia w pliku `adresy.txt` to wyświetl *???*.
 */

public class ReadPeopleExercise {

    public static void main(String[] args) throws IOException {

        List<String> rawAddresses = Files.readAllLines(Paths.get("files/src/main/resources/adresy"));

        Map<String, String> addresses = new HashMap<>();

        for (String address : rawAddresses) {
            String[] parsed = address.split("\\|");
            addresses.put(parsed[0], parsed[1]);
        }

        List<String> rawPeople = Files.readAllLines(Paths.get("files/src/main/resources/osoby"));

        Map<String, String> people = new HashMap<>();

        for (String person : rawPeople) {
            String[] parsed = person.split("\\|");
            people.put(parsed[0], parsed[1]);
        }


        for(Map.Entry<String, String> person: people.entrySet()) {
            System.out.println(person.getKey()+ ", " + person.getValue()
                    + ", " + addresses.getOrDefault(person.getKey(), "???"));

        }
    }
}
