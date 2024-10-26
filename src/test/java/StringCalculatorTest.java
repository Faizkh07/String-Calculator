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

    @Test
    public void get_a_number_for_single_string(){
        Assertions.assertEquals(2, stringCalculator.add("2"));
    }

    @Test
    public void get_sum_of_two_numbers(){
        Assertions.assertEquals(5, stringCalculator.add("2,3"));
    }
}
