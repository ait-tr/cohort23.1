import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach //
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication works")
    void testMultiply(){
        assertEquals(20,calculator.multiply(4,5),"4*5 should be 20");
    }

    @Test
    @DisplayName("correct handling of zero multiplication")
    void testMultiplyWithZero(){
        assertEquals(0,calculator.multiply(0,3),"Multiplication with zero should be zero");
        assertEquals(0,calculator.multiply(3,0),"Multiplication with zero should be zero");
    }


}
