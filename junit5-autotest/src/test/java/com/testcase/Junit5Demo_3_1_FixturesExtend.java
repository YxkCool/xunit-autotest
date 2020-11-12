package com.testcase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 10:07
 * @since 1.0
 */
public class Junit5Demo_3_1_FixturesExtend extends Junit5Demo_3_1_Fixtures {
    @BeforeAll
    public static void beforeChildAll() {
        System.out.println("Child beforeAll 执行！");
    }

    @AfterAll
    public static void afterChildAll() {
        System.out.println("Child afterAll 执行！");
    }

    @BeforeEach
    public void beforChildEach() {
        System.out.println("Child BeforeEach 执行！");
    }

    @AfterEach
    public void afterChildEach() {
        System.out.println("Child AfterEach 执行！");
    }

    @Test
    public void testChildMethod01() {
        System.out.println("Child testMethod01 执行！");
    }

    @Test
    public void testChildMethod02() {
        System.out.println("Child testMethod02 执行！");
    }

    @Test
    public void testChildMethod03() {
        System.out.println(" Child  testMethod03 执行！");
    }
}
