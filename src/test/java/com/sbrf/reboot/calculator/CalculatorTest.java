package com.sbrf.reboot.calculator;

import com.sbrf.reboot.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getAddition() {
        assertEquals(9, Calculator.getAddition(4, 5));
    }

    @Test
    void getAdditionTenToFive() {
        double expected = -5;
        double result =  Calculator.getAddition(-10,5);
        assertEquals(expected,result);
    }

    @Test
    void getAdditionTenToZeroT() {
        double expected = 10;
        double result =  Calculator.getAddition(10,0);
        assertEquals(expected,result);
    }

    @Test
    void getAdditionDoubleMaxValueToOne() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.getAddition(Double.MAX_VALUE, 1);
        });
    }

    @Test
    void getSubtraction() {
        assertEquals(-1, Calculator.getSubtraction(4, 5));
    }

    @Test
    void getSubtractionMinesNineFromTen(){
        double expected = 19;
        double result = Calculator.getSubtraction(10,-9);
        assertEquals(expected,result);

    }

    @Test
    void getSubtractionZeroFromTen() {
        double expected = 10;
        double result = Calculator.getSubtraction(10, 0);
        assertEquals(expected, result);
    }

    @Test
    void getMultiplication() {
        assertEquals(20, Calculator.getMultiplication(4, 5));
    }

    @Test
    void getMultiplication100ByMines10(){
        double expected = -1000;
        double result = Calculator.getMultiplication(100,-10);
        assertEquals(expected,result);

    }
    @Test
    void getMultiplicationTenByZero(){
        double expected = 0;
        double result = Calculator.getMultiplication(10,0);
        assertEquals(expected,result);

    }

    @Test
    void getMultiplicationDoubleMaxValueBy2() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.getMultiplication(Double.MAX_VALUE, 2);
        });

    }

    @Test
    void getDivision() {
        assertEquals(3, Calculator.getDivision(9, 3));
    }

    @Test
    void getDivision100byMines10(){
        double expected = -10;
        double result = Calculator.getDivision(100,-10);
        assertEquals(expected,result);

    }

    @Test
    void getDivision100by0(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.getDivision(100, 0);
        });
    }

    @Test
    void getSquare(){
        assertEquals(4, Calculator.getSquare(2));
    }

    @Test
    void getSquareDoubleMaxValue(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.getSquare(Double.MAX_VALUE/2);
        });
    }

    @Test
    void getSquareRoot(){
        assertEquals(2, Calculator.getSquareRoot(4));
    }


    @Test
    void getSin(){
        assertEquals(0.8414709848078965, Calculator.getSin(1));
    }

    @Test
    void getSin0(){
        assertEquals(0, Calculator.getSin(0));
    }

    @Test
    void classHasSevenMethods(){
        assertEquals(7,Calculator.class.getMethods().length-Object.class.getMethods().length);
    }


}