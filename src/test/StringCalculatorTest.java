import main.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest  {

    private StringCalculator cal;

    StringCalculatorTest(){
        cal = new StringCalculator();
    }

    @Test
    public void testSplit() throws Exception {
        String[] result = cal.split("1");
        Assertions.assertArrayEquals(new String[]{"1"}, result);
    }


    @Test
    public void testSplitWhenComma() throws Exception {
        String[] result = cal.split("1,2,3");
        Assertions.assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }


    @Test
    public void testSplitWhenNewLine() throws Exception {
        String[] result = cal.split("1\n2\n3");
        Assertions.assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }


    @Test
    public void testSplitWhenNewLineAndComma() throws Exception {
        StringCalculator cal = new StringCalculator();
        String[] result = cal.split("1,2\n3");
        Assertions.assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }


}
