package pl.sda.enums;

/**
 * Stwórz typ wyliczeniowy `Color`.
 * Dodaj kolory, takie jak `BLACK`, `RER`, `YELLOW`.
 * Dodaj do niego metode `String getHex()` zwracającą heksadecymalną reprezentację koloru.
 */

public enum Color {
    BLACK("000000"), RED("ff0000"), YELLOW("ffff00");

    private final String hex;

    Color(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
