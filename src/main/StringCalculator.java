package main;

public class StringCalculator {
    public String[] split(String text) {
        if(text == null){
            return new String[]{};
        }

        return text.split(",|\n");
    }

    public int[] toInt(String[] values) {
        int[]numbers = new int[values.length];

        for (int i = 0 ; i < values.length; i++){
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }
}
