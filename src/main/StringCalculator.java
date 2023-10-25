package main;

public class StringCalculator {
    public String[] split(String text) {
        if(text == null){
            return new String[]{};
        }

        return text.split(",|\n");
    }
}
