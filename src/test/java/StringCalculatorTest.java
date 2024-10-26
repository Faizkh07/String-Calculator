import org.example.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {


    StringCalculator stringCalculator;

    @BeforeEach
    public void getInstance(){
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void destroy(){
        stringCalculator = null;
    }

    @Test
    public void get_zero_for_empty_string_number(){
        Assertions.assertEquals(0, stringCalculator.add(""));
    }
}
