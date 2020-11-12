package com.testcase;

import com.test.util.Calculator;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 09:57
 * @since 1.0
 */
public class Junit5Demo_1_1_Base {
    @Test
    public void addTest() {
        int result = Calculator.add(4, 2);
        System.out.println(result);
    }

    @Test
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
    }

    @Test
    public void multiplyTest() {
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
    }

    @Test
    public void divideTest() {
        int result = Calculator.divide(4, 2);
        System.out.println(result);
    }

    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
    }
}
