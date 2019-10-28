package pl.sda.numberconverter;

public class HexNumberConverter implements NumberConverter {

    @Override
    public String convert(Integer number) {
        return ANSI_CYAN + Integer.toHexString(number) + ANSI_RESET;
    }
}
