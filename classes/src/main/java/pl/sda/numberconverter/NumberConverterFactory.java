package pl.sda.numberconverter;

public class NumberConverterFactory {

    public static NumberConverter create(String type) {
        if(type.equals("hex")) {
            return new HexNumberConverter();
        } else if(type.equals("morse")) {
            return new MorseCodeNumberConverter();
        } else {
            return i -> i.toString();
        }
     }

    public static void main(String[] args) {
        NumberConverter hexConverter = NumberConverterFactory.create("hex");
        NumberConverter morseConverter = NumberConverterFactory.create("morse");
        NumberConverter simple = NumberConverterFactory.create("???");

        System.out.println(hexConverter.convert(100));
        System.out.println(morseConverter.convert(100));
        System.out.println(simple.convert(100));
    }

}
