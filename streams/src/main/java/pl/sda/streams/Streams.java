package pl.sda.streams;

import pl.sda.streams.internal.Repository;
import pl.sda.streams.internal.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

    private final Repository repository = new Repository();

    /**
     * Zwróć set zawierający wszystkich użytkowników.
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
        return repository.getUsers().map(u -> u.getAge()).max(Integer::compareTo).orElse(0);
    }

    /**
     * Zwróć posortowaną listę unikalnych wartości wieku użytkowników.
     */
    List<Integer> findAges() {
        return repository.getUsers().map(u -> u.getAge()).distinct().sorted().collect(Collectors.toList());
    }

    /**
     * Zwróć listę imion użytkowników.
     */
    List<String> allFirstNames() {
        return repository.getUsers().map(u -> u.getFirstName()).collect(Collectors.toList());
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
    List<String> allNamesUppercased() {
        return repository.getUsers().map(u -> u.getFirstName() + " " + u.getLastName()).map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    /**
     * Zwróc wszystkich użytkowników starszych niż wiek podany jako parametr.
     */
    List<User> findAllOlderThan(int age) {
        return repository.getUsers().filter(u -> u.getAge() > age).collect(Collectors.toList());
    }

    /**
     * Zwróć imiona wszystkich użytkowników podzielone przecinkami ako jeden łańcuch znaków.
     */
    String joined() {
        return repository.getUsers().map(u -> u.getFirstName()).collect(Collectors.joining(","));
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
        return repository.getUsers().collect(Collectors.groupingBy(u -> u.getAge()));
    }

    /**
     * Zwróć mapę wszystkich użytkowników pogrupowanych według domeny ich emaili (domena to adres po @).
     */
    Map<String, List<User>> groupByDomain() {
        return repository.getUsers().collect(Collectors.groupingBy(u -> u.getEmail().split("@")[1]));
    }





}
