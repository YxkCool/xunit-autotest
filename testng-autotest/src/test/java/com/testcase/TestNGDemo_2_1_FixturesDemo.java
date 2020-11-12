package com.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 11:04
 * @since 1.0
 */
public class TestNGDemo_2_1_FixturesDemo {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(" beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(" afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(" beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(" afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(" beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(" afterClass");
    }

    @BeforeMethod
    public void beofreMethod() {
        System.out.println(" beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(" afterMethod");
    }

    @Test
    public void test1() {
        System.out.println(" method1");
    }

    @Test
    public void test2() {
        System.out.println(" methods2");
    }
}
