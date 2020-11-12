package com.testcase;

import com.test.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

/**
 * @author Kayenee
 * @Date: 2020/11/12 10:08
 * @since 1.0
 */
public class Junit5Demo_4_1_Parallel {
    @RepeatedTest(10)
    @Execution(ExecutionMode.CONCURRENT)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }

    @RepeatedTest(10)
    public void countSynTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println(result);
    }
}
