package com.calculator.test;

import com.calculator.test.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class ParametrizedServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    //Тест суммы
    static Stream<Arguments> dataForSum() {
        return Stream.of(
                Arguments.of(3, 5, 8),
                Arguments.of(201, 38, 239),
                Arguments.of(-111, 11, -100),
                Arguments.of(-111, -11, -122)
        );
    }


    @ParameterizedTest
    @MethodSource("dataForSum")
    void test(int n1, int n2, int sum) {
        Assertions.assertEquals(calculatorService.sum(n1, n2), sum);
    }

    //Тест разницы
    static Stream<Arguments> dataForMinus() {
        return Stream.of(
                Arguments.of(3, 5, -2),
                Arguments.of(201, 38, 163),
                Arguments.of(-111, 11, -122),
                Arguments.of(-111, -11, -100)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMinus")
    void test2(int n1, int n2, int minus) {
        Assertions.assertEquals(calculatorService.minus(n1, n2), minus);
    }

    static Stream<Arguments> dataForMultiply() {
        return Stream.of(
                Arguments.of(3, 5, 15),
                Arguments.of(21, 10, 210),
                Arguments.of(-1, 11, -11),
                Arguments.of(-111, -1, 111)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void test3(int n1, int n2, int multiply) {
        Assertions.assertEquals(calculatorService.multiply(n1, n2), multiply);
    }
    static Stream<Arguments> dataForDivide() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(20, 10, 2),
                Arguments.of(11, -1, -11),
                Arguments.of(111, -1, -111)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForDivide")
    void test4(int n1, int n2, int divide) {
        Assertions.assertEquals(calculatorService.divide(n1, n2), divide);
    }

}