import main.StringCalculator;
import org.junit.jupiter.api.Assertions;

public class StringCalculatorTest {

    public void testSplit() throws Exception {
        StringCalculator cal = new StringCalculator();
        String[] result = cal.split("1,2,3");
        Assertions.assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }


}
