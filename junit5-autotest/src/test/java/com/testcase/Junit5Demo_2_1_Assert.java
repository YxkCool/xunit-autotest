package com.testcase;

import com.test.util.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 10:00
 * @since 1.0
 */
public class Junit5Demo_2_1_Assert {
    @Test
    public void addTest() {
        int result = Calculator.add(4, 2);
        System.out.println(result);
        assertEquals(6, result);
    }

    @Test
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
        assertEquals(2, result);

    }

    @Test
    public void multiplyTest() {
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
        assertEquals(8, result);

    }

    @Test
    public void divideTest() {
        int result = Calculator.divide(4, 2);
        System.out.println(result);
        assertEquals(2, result);

    }

    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4, result);

    }
}
