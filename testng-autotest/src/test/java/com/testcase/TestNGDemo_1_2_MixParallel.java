package com.testcase;

import com.test.util.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Kayenee
 * @Date: 2020/11/12 11:26
 * @since 1.0
 */
public class TestNGDemo_1_2_MixParallel {

    @Test(threadPoolSize = 2, invocationCount = 5)
    public void addTest() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();
        int result = Calculator.add(4, 2);
        System.out.println("完成加法计算，结果为：" + result);
        Assert.assertEquals(result, 6);
    }

    @Test(threadPoolSize = 2, invocationCount = 5)
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4, 2);
        System.out.println("完成减法计算，结果为：" + result);
        Assert.assertEquals(result, 2);
    }
}
