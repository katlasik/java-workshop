package pl.sda.streams;

import pl.sda.streams.internal.Repository;
import pl.sda.streams.internal.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Streams {

    private final Repository repository = new Repository();

    /**
     * Zwróć set zawierający wszystkich użytkowników korzystając z metody **repository.getUsers**.
     */
    Set<User> findAllUsers() {
        return null;
    }

    /**
     * Zwróć listę imion użytkowników.
     */
    List<String> allFirstNames() {
        return null;
    }

    /**
     * Zwróć listę emaili użytkowników.
     */
    List<String> allEmails() {
        return null;
    }

    /**
     * Zwróć listę wszystkich pierwszych imion użytkowników.
     */
    List<String> allInitialLettersOfNames() {
        return null;
    }

    /**
     * Znajdź wszystkich użytkowników, których imię zaczyna się od prefiksu. Użyj funkcji `String.startsWith`.
     */
    List<User> findAllUsersWithFirstNameStartingWith(String prefix) {
        return null;
    }

    /**
     * Znajdź największy wiek użytkownika. Jeżeli nie zostaną podani żadni użytkownicy, to zwróć 0.
     */
    int findMaxAge() {
        return 0;
    }

    /**
     * Zwróć posortowaną listę unikalnych wartości wieku użytkowników.
     */
    List<Integer> findAges() {
        return null;
    }

    /**
     * Wyszukaj pierwszego użytkownika po podanym adresie email.
     */
    Optional<User> getByEmail(String email) {
        return null;
    }


    /**
     * Zwróć listę imion i nazwisk (połączonych jako jeden łańcuch, ze spacją jako separatorem) użytkowników z literami zamienionymi na duże.
     */
    Stream<String> allNamesUppercased() {
        return null;
    }

    /**
     * Zwróc wszystkich użytkowników starszych niż wiek podany jako parametr.
     */
    Stream<User> findAllOlderThan(int age) {
        return null;
    }

    /**
     * Zwróć imiona wszystkich użytkowników podzielone przecinkami ako jeden łańcuch znaków.
     */
    String joined() {
        return null;
    }

    /**
     * Zwróć listę wszystkich użytkowników limitowaną do ilości podanej jako parametr.
     */
    List<User> limited(int limit) {
        return null;
    }

    /**
     * Zwróć mapę użytkowników pogrupowanych według wieku.
     */
    Map<Integer, List<User>> groupByAge() {
        return null;
    }

    /**
     * Zwróć mapę wszystkich użytkowników pogrupowanych według domeny ich emaili (domena to adres po @).
     */
    Map<String, List<User>> groupByDomain() {
        return null;
    }

    /**
     * Zwróć listę tytułów wszystkich maili wszystkich użytkowników korzystając z metody **repository.getMessageTitles**.
     */
    Stream<String> getAllMessageTitles() {
        return null;
    }

    /**
     * Zróć listę łańcuchów znaków zawierającą email oraz tytuł wiadomości, na przykład:
     * 'email@gmail.com - Promocja!' ale tylko jeżeli domena emaila zgadza się z podaną w parametrze.
     * Dla domen różych od parametru, zwróć pojedyńczą wartość: 'email@wp.pl - Brak wiadomości'.
     */
    Stream<String> getAllMessageTitlesOfDomain(String domain) {
        return null;
    }


}
