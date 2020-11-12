package com.testcase;

import com.test.util.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.RepeatedTest;

/**
 * @author Kayenee
 * @Date: 2020/11/12 10:09
 * @since 1.0
 */
public class Junit5Demo_4_2_MixParallel {
    @RepeatedTest(10)
    public void addTest() {
        int result = Calculator.add(4, 2);
        System.out.println(result);
        assertEquals(6, result);
    }

    @RepeatedTest(10)
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }
}
