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
 * @Date: 2020/11/12 11:01
 * @since 1.0
 */
public class TestNGDemo_1_1_FixturesExtends extends TestNGDemo_2_1_FixturesDemo {

    @BeforeSuite
    public void chaildBeforeSuite() {
        System.out.println("chaild beforeSuite");
    }

    @AfterSuite
    public void chaildAfterSuite() {
        System.out.println("chaild afterSuite");
    }

    @BeforeTest
    public void chaildBeforeTest() {
        System.out.println("chaild beforeTest");
    }

    @AfterTest
    public void chaildAfterTest() {
        System.out.println("chaild afterTest");
    }

    @BeforeClass
    public void chaildBeforeClass() {
        System.out.println("chaild beforeClass");
    }

    @AfterClass
    public void chaildAfterClass() {
        System.out.println("chaild afterClass");
    }

    @BeforeMethod
    public void chaildBeofreMethod() {
        System.out.println("chaild beforeMethod");
    }

    @AfterMethod
    public void chaildAfterMethod() {
        System.out.println("chaild afterMethod");
    }

    @Test
    public void chaildTest1() {
        System.out.println("chaild method1");
    }

    @Test
    public void chaildTest2() {
        System.out.println("chaild methods2");
    }
}
