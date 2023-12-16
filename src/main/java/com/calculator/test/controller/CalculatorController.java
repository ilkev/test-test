package com.calculator.test.controller;

import com.calculator.test.exeption.DivideExeption;
import com.calculator.test.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String salute() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        int result = calculatorService.sum(a, b);
        return String.format("%s + %s = %s", a, b, result);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = calculatorService.minus(a, b);
        return String.format("%s - %s = %s", a, b, result);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = calculatorService.multiply(a, b);
        return String.format("%s * %s = %s", a, b, result);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (b == 0) {
            throw new DivideExeption();
        }
        int result = calculatorService.divide(a, b);
        return String.format("%s / %s = %s", a, b, result);
    }
}
