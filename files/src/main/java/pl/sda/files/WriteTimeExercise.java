package pl.sda.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;
import java.util.List;

/**
 * Wczytaj plik wpisujący obecną datę i godzinę do pliku `time`. Kolejne uruchomienia programu
 * powinny pozostawiać starą zawartość, a tylko dodawać nową linię na końcu pliku.
 */
public class WriteTimeExercise {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("files/src/main/resources/time");

        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        Files.write(path, List.of(LocalTime.now().toString()), StandardOpenOption.APPEND);
    }

}
