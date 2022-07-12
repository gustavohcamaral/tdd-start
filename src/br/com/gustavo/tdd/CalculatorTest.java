package br.com.gustavo.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    public void itShouldSumTwoPositiveNumbers(){
        Calculator calc = new Calculator();
        int sum = calc.sum(3,7);
        Assertions.assertEquals(10, sum);
    }

}
