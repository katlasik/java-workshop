package pl.sda.numberconverter;

public class NumberConverterFactory {

    NumberConverter create(String type) {
        if(type.equals("hex")) {
            return new HexNumberConverter();
        } else if(type.equals("morse")) {
            return new MorseCodeNumberConverter();
        } else {
            return new SimpleNumberConverter();
        }
     }

}
