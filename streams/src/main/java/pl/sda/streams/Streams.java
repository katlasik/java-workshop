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
        return repository.getUsers().collect(Collectors.toSet());
    }

    /**
     * Znajdź wszystkich użytkowników, których imię zaczyna się od prefiksu. Użyj funkcji `String.startsWith`.
     *
     */
    List<User> findAllUsersWithFirstNameStartingWith(String prefix) {
        return repository.getUsers().filter(u -> u.getFirstName().startsWith(prefix)).collect(Collectors.toList());
    }

    /**
     * Znajdź największy wiek użytkownika. Jeżeli nie zostaną podani żadni użytkownicy, to zwróć 0.
     */
    int findMaxAge() {
        return repository.getUsers().map(User::getAge).max(Integer::compareTo).orElse(0);
    }

    /**
     * Zwróć posortowaną listę unikalnych wartości wieku użytkowników.
     */
    List<Integer> findAges() {
        return repository.getUsers().map(User::getAge).distinct().sorted().collect(Collectors.toList());
    }

    /**
     * Zwróć listę imion użytkowników.
     */
    List<String> allFirstNames() {
        return repository.getUsers().map(User::getFirstName).collect(Collectors.toList());
    }

    /**
     * Wyszukaj pierwszego użytkownika po podanym adresie email.
     */
    Optional<User> getByEmail(String email) {
        return repository.getUsers().filter(u -> u.getEmail().equals(email)).findFirst();
    }


    /**
     * Zwróć listę imion i nazwisk (połączonych jako jeden łańcuch, ze spacją jako separatorem) użytkowników z literami zamienionymi na duże.
     */
    Stream<String> allNamesUppercased() {
        return repository.getUsers().map(u -> u.getFirstName() + " " + u.getLastName()).map(String::toUpperCase);
    }

    /**
     * Zwróc wszystkich użytkowników starszych niż wiek podany jako parametr.
     */
    Stream<User> findAllOlderThan(int age) {
        return repository.getUsers().filter(u -> u.getAge() > age);
    }

    /**
     * Zwróć imiona wszystkich użytkowników podzielone przecinkami ako jeden łańcuch znaków.
     */
    String joined() {
        return repository.getUsers().map(User::getFirstName).collect(Collectors.joining(","));
    }

    /**
     * Zwróć listę wszystkich użytkowników limitowaną do ilości podanej jako parametr.
     */
    List<User> limited(int limit) {
        return repository.getUsers().limit(limit).collect(Collectors.toList());
    }

    /**
     * Zwróć mapę użytkowników pogrupowanych według wieku.
     */
    Map<Integer, List<User>> groupByAge() {
        return repository.getUsers().collect(Collectors.groupingBy(User::getAge));
    }

    /**
     * Zwróć mapę wszystkich użytkowników pogrupowanych według domeny ich emaili (domena to adres po @).
     */
    Map<String, List<User>> groupByDomain() {
        return repository.getUsers().collect(Collectors.groupingBy(u -> u.getEmail().split("@")[1]));
    }

    /**
     * Zwróć listę tytułów wszystkich maili wszystkich użytkowników korzystając z metody **repository.getMessageTitles**.
     */
    Stream<String> getAllMessageTitles() {
        return repository.getUsers().flatMap(u -> repository.getMessageTitles(u.getEmail()));
    }

    /**
     * Zróć listę łańcuchów znaków zawierającą email oraz tytuł wiadomości, na przykład:
     * 'email@gmail.com - Promocja!' ale tylko jeżeli domena emaila zgadza się z podaną w parametrze.
     * Dla domen różych od parametru, zwróć pojedyńczą wartość: 'email@wp.pl - Brak wiadomości'.
     *
     * */
    Stream<String> getAllMessageTitlesOfDomain(String domain) {
        return repository.getUsers().flatMap(u -> {
            if(u.getEmail().split("@")[1].equals(domain)) {
                return repository.getMessageTitles(u.getEmail()).map(t -> u.getEmail() + " - " + t);
            } else {
                return Stream.of(u.getEmail() + " - " + "Brak wiadomości");
            }
        });
    }



}
