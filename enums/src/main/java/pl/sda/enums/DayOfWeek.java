package pl.sda.enums;

/**
 * Stwórz typ wyliczeniowy `DayOfWeek` zawierający nazwy dni tygodnia.
 * Dodaj do enumeracji pole zwracające skróconą nazwę, dnia np, `Tue`.
 * Dodaj do enumeracji metodę `isWeekend` zwracającą **true** dla soboty i niedzieli.
 * Stwórz enumerację `WeekendType` zawierającą dwie wartości `Regular` i `Islamic`.
 * Stwórz przeładowaną metodę `isWeekend`, że gdy otrzyma `weekendType` `Islamic` to zwraca **true** dla piątku i soboty.
 * Stwórz klasę `OfficeWorkingHours`  otrzymującą jako wejście `DayOfWeek`.
 * Klasa w konstruktorze musi otrzymać listę zawierająca `DayOfWeek` o nazwie `daysWithExtendedWorkingHours` i zapisać je jako pole.
 * Stwórz metodę `String getOfficeWorkingHours(DayOfWeek day)` zwracającą czas pracy urzędu:
 * * *8-15* jeżeli jest to normalny dzień
 * * *8-17* jeżeli jest to dzień z rozszerzonymi godzinami pracy
 * * *zamknięte* jeżeli jest to weekend.
 */

public enum DayOfWeek {
}
