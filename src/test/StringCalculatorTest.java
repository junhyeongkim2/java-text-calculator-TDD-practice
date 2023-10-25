import main.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void testSplit() throws Exception {
        StringCalculator cal = new StringCalculator();
        String[] result = cal.split("1,2,3");
        Assertions.assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }


    @Test
    public void testSplitWhenNewLine() throws Exception {
        StringCalculator cal = new StringCalculator();
        String[] result = cal.split("1\n2\n3");
        Assertions.assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }


}
