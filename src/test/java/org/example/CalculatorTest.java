package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void should_GetSumOfTwoNumbers_when_AddCalled() {

        // double
        double firstNumber = 1.0;
        double secondNumber = 3.0;

        Calculator calculator = new Calculator();

        // act
        double result = calculator.Add(firstNumber, secondNumber);

        // Assert
//        MatcherAssert.assertThat(result, is(4.0));
        assertEquals(result, 4.0);
    }

}