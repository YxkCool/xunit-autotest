package com.testcase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 10:06
 * @since 1.0
 */
public class Junit5Demo_3_1_Fixtures {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll 执行！");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll 执行！");
    }

    @BeforeEach
    public void beforEach() {
        System.out.println("BeforeEach 执行！");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach 执行！");
    }

    @Test
    public void testMethod01() {
        System.out.println("testMethod01 执行！");
    }

    @Test
    public void testMethod02() {
        System.out.println("testMethod02 执行！");
    }

    @Test
    public void testMethod03() {
        System.out.println("testMethod03 执行！");
    }

}
