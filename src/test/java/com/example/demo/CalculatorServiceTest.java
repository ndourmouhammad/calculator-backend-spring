package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void testAdd() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result); // On vérifie l'égalité ici
    }
}
