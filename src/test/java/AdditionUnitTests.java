import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTests {
    @Test
    public void add_int_1_and_int_2_return_3() {
        //Arrange
        int a = 1;
        int b = 2;
        int expectedAnswer = 3;
        Calculator calc = new Calculator();

        //ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        //ASSERT
        assertEquals(expectedAnswer,actualAnswer);
    }
}
