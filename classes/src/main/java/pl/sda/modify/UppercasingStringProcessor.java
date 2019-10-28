package pl.sda.modify;

public class UppercasingStringProcessor implements StringProcessor{

    public String process(String text) {
        return text.toUpperCase();
    }

}
