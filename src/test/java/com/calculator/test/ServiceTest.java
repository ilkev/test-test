package com.calculator.test;

import com.calculator.test.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void sum(){
        int sum = calculatorService.sum(6,2);
        Assertions.assertEquals(8,sum);
    }
    @Test
    void sumNegative(){
        int sum = calculatorService.sum(-6,-2 );
        Assertions.assertEquals(-8,sum);
    }
    @Test
    void minus(){
        int minus = calculatorService.minus(6,2);
        Assertions.assertEquals(4,minus);
    }
    @Test
    void minusNegative(){
        int minus = calculatorService.minus(2,6 );
        Assertions.assertEquals(-4,minus);
    }
    @Test
    void multiply(){
        int multiply = calculatorService.multiply(6,2);
        Assertions.assertEquals(12 ,multiply);
    }
    @Test
    void multiplyNegative(){
        int multiply = calculatorService.multiply(6,-2 );
        Assertions.assertEquals(-12,multiply);
    }
    @Test
    void divide(){
        int divide = calculatorService.divide(6,2);
        Assertions.assertEquals(3 ,divide);
    }
    @Test
    void divideNegative(){
        int divide = calculatorService.divide(6,-2 );
        Assertions.assertEquals(-3,divide);
    }
}
