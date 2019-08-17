package pl.sda.numberconverter;

public class HexNumberConverter implements NumberConverter {
    @Override
    public String convert(Integer number) {
        return Integer.toHexString(number);
    }
}
