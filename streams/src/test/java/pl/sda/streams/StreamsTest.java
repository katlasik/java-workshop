package pl.sda.streams;

import org.junit.jupiter.api.Test;
import pl.sda.streams.internal.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class StreamsTest {

    private final Streams streams = new Streams();

    @Test
    void findAllUsers() {
        assertThat(streams.findAllUsers()).containsExactlyInAnyOrder(
                new User("Roman", "Kozielski", 20, "rkoz@adres.pl"),
                new User("Darek", "Glanowski", 54, "dg@wb.pl"),
                new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl"),
                new User("Sławomir", "Nitka", 34, "nit@wb.pl"),
                new User("Agnieszka", "Więcławek", 36, "aw@gmail.com"),
                new User("Wojciech", "Więcławek", 34, "ww@gmail.com")
        );
    }

    @Test
    void findAllUsersWithFirstNameStartingWith() {
        assertThat(streams.findAllUsersWithFirstNameStartingWith("Rom")).containsExactly(
                new User("Roman", "Kozielski", 20, "rkoz@adres.pl")
        );

        assertThat(streams.findAllUsersWithFirstNameStartingWith("Da")).containsExactly(
                new User("Darek", "Glanowski", 54, "dg@wb.pl")
        );

        assertThat(streams.findAllUsersWithFirstNameStartingWith("XX")).isEmpty();
    }

    @Test
    void findMaxAge() {
        assertThat(streams.findMaxAge()).isEqualTo(54);
    }

    @Test
    void findAges() {
        assertThat(streams.findAges()).containsExactly(20, 34, 36, 44, 54);
    }

    @Test
    void allFirstNames() {
        assertThat(streams.allFirstNames()).containsExactly("Roman", "Darek", "Bartek", "Sławomir", "Agnieszka", "Wojciech");
    }

    @Test
    void getByEmail() {
        assertThat(streams.getByEmail("bartek@kozlarz.pl")).contains(new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl"));
        assertThat(streams.getByEmail("nit@wb.pl")).contains(new User("Sławomir", "Nitka", 34, "nit@wb.pl"));
        assertThat(streams.getByEmail("test@wb.pl")).isEmpty();

    }

    @Test
    void allNamesUppercased() {
        assertThat(streams.allNamesUppercased()).contains(
                "ROMAN KOZIELSKI",
                "DAREK GLANOWSKI",
                "BARTEK KOŹLARZ",
                "SŁAWOMIR NITKA",
                "AGNIESZKA WIĘCŁAWEK",
                "WOJCIECH WIĘCŁAWEK"
        );
    }

    @Test
    void findAllOlderThan() {
        assertThat(streams.findAllOlderThan(34)).containsExactly(
                new User("Darek", "Glanowski", 54, "dg@wb.pl"),
                new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl"),
                new User("Agnieszka", "Więcławek", 36, "aw@gmail.com")
        );

        assertThat(streams.findAllOlderThan(42)).containsExactly(
                new User("Darek", "Glanowski", 54, "dg@wb.pl"),
                new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl")
        );
    }

    @Test
    void joined() {
        assertThat(streams.joined()).isEqualTo(
                "Roman,Darek,Bartek,Sławomir,Agnieszka,Wojciech"
        );
    }

    @Test
    void limited() {
        assertThat(streams.limited(2)).containsExactly(
                new User("Roman", "Kozielski", 20, "rkoz@adres.pl"),
                new User("Darek", "Glanowski", 54, "dg@wb.pl")
        );

        assertThat(streams.limited(4)).containsExactly(
                new User("Roman", "Kozielski", 20, "rkoz@adres.pl"),
                new User("Darek", "Glanowski", 54, "dg@wb.pl"),
                new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl"),
                new User("Sławomir", "Nitka", 34, "nit@wb.pl")
        );
    }

    @Test
    void groupByAge() {


        assertThat(streams.groupByAge().entrySet()).hasSameElementsAs(
                Map.of(
                        34, List.of(new User("Sławomir", "Nitka", 34, "nit@wb.pl"), new User("Wojciech", "Więcławek", 34, "ww@gmail.com")),
                        36, List.of(new User("Agnieszka", "Więcławek", 36, "aw@gmail.com")),
                        44, List.of(new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl")),
                        54, List.of(new User("Darek", "Glanowski", 54, "dg@wb.pl")),
                        20, List.of(new User("Roman", "Kozielski", 20, "rkoz@adres.pl"))
                ).entrySet()
        );
    }

    @Test
    void groupByDomain() {
        assertThat(streams.groupByDomain().entrySet()).hasSameElementsAs(
                Map.of(
                        "wb.pl", List.of(new User("Darek", "Glanowski", 54, "dg@wb.pl"), new User("Sławomir", "Nitka", 34, "nit@wb.pl")),
                        "gmail.com", List.of(new User("Agnieszka", "Więcławek", 36, "aw@gmail.com"), new User("Wojciech", "Więcławek", 34, "ww@gmail.com")),
                        "kozlarz.pl", List.of(new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl")),
                        "adres.pl", List.of(new User("Roman", "Kozielski", 20, "rkoz@adres.pl"))
                ).entrySet()
        );
    }

    @Test
    void getAllMessageTitles() {
        assertThat(streams.getAllMessageTitles().collect(Collectors.toList()))
                .containsOnly(
                        "Kup mleko.",
                        "Jak się masz?",
                        "Faktura VAT",
                        "Twoja rezerwacja została potwierdzona",
                        "Oferta pracy",
                        "Promocja",
                        "Otrzymaj 100 złotych losów",
                        "Twoja subskrypcja wygasła",
                        "Zaproszenie",
                        "Oferta kupna"
                );
    }


    @Test
    void getAllMessageTitlesOfDomain() {
        assertThat(streams.getAllMessageTitlesOfDomain("gmail.com"))
                .containsOnly(
                        "rkoz@adres.pl - Brak wiadomości",
                        "dg@wb.pl - Brak wiadomości",
                        "bartek@kozlarz.pl - Brak wiadomości",
                        "nit@wb.pl - Brak wiadomości",
                        "aw@gmail.com - Twoja subskrypcja wygasła",
                        "ww@gmail.com - Zaproszenie",
                        "ww@gmail.com - Oferta kupna"
                );

        assertThat(streams.getAllMessageTitlesOfDomain("adres.pl"))
                .containsOnly(
                        "rkoz@adres.pl - Kup mleko.",
                        "rkoz@adres.pl - Jak się masz?",
                        "dg@wb.pl - Brak wiadomości",
                        "bartek@kozlarz.pl - Brak wiadomości",
                        "nit@wb.pl - Brak wiadomości",
                        "aw@gmail.com - Brak wiadomości",
                        "ww@gmail.com - Brak wiadomości"
                );

    }
}
