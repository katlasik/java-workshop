package pl.sda.numberconverter;


import java.util.Map;

public class SimpleNumberConverter implements NumberConverter {
    public String convert(Integer number) {
        return Integer.toString(number);
    }
}
