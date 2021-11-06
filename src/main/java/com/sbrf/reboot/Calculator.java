package com.sbrf.reboot;

public class Calculator {
    public  static double getAddition(double value1, double value2){
        if (value1 + value2 == Double.MAX_VALUE){
            throw new ArithmeticException("Double overflowed");
        }
        return value1 + value2;
    }

    public static double getSubtraction(double value1, double value2){
        return value1 - value2;
    }

    public static double getMultiplication(double value1, double value2){
        if (value1 * value2 == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflowed");
        }
        return  value1 * value2;
    }

    public  static double getDivision(double value1, double value2){
        if (value1 / value2 == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflowed");
        }
        return  value1 / value2;
    }

    public static double getSquare(double value1) {
        if (value1 * value1 == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflowed");
        }
        return value1 * value1;
    }

    public static double getSquareRoot(double value1) {
        if (value1 == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflowed");
        }
        return Math.sqrt(value1);
    }

    public static double getSin(double value1) {
        return Math.sin(value1);
    }

}
