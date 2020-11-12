package com.testcase;

import com.test.util.Calculator;
import org.testng.annotations.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 11:08
 * @since 1.0
 */
public class TestNGDemo_1_1Parallel {

    @Test(threadPoolSize = 3, invocationCount = 10, timeOut = 10000)
    public void countTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println("计算加法结果为： " + result);
    }
}
