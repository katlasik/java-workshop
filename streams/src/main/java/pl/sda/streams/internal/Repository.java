package pl.sda.streams.internal;

import java.util.stream.Stream;

public class Repository {

    public Stream<User> getUsers() {
        return Stream.of(
                new User("Roman", "Kozielski", 20, "rkoz@adres.pl"),
                new User("Darek", "Glanowski", 54, "dg@wb.pl"),
                new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl"),
                new User("Sławomir", "Nitka", 34, "nit@wb.pl"),
                new User("Agnieszka", "Więcławek", 36, "aw@gmail.com"),
                new User("Wojciech", "Więcławek", 34, "ww@gmail.com")
        );
    }
}
