package pl.sda.numberconverter;


import java.util.Map;

public class MorseCodeNumberConverter implements NumberConverter {

    private final static Map<Character, String> DICT = Map.of(
            '1', "• — — — —",
            '2', "• • — — —",
            '3', "• • • — —",
            '4', "• • • • —",
            '5', "• • • • •",
            '6', "— • • • •",
            '7', "— — • • •",
            '8', "— — — • •",
            '9', "— — — — •",
            '0', "— — — — —"
    );

    public String convert(Integer number) {

        String result = "";
        for (char c: number.toString().toCharArray()) {
            result += DICT.get(c) + " ";
        }
        return result;
    }
}
