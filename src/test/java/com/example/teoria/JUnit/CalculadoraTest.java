package com.example.teoria.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void divisao() {
        Calculadora calc = new Calculadora();
        int divisao = calc.divisao(10, 2);
        Assertions.assertEquals(5, divisao);
    }

    @Test
    void soma() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma(10, 20);
        Assertions.assertEquals(30, soma);
    }

    @Test
    void verificarPar() {
        Calculadora calc = new Calculadora();
        boolean par = calc.verificarPar(10);
        Assertions.assertEquals(true, par);
    }

}
