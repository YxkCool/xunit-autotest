package com.testcase;

import com.test.util.Calculator;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/12 10:11
 * @since 1.0
 */
@Epic("Epic 计算器项目")
@Feature("Feature 冒烟测试用例")
public class Junit5Demo_5_1_Allure {

    @Test
    @Order(1)
    @Description("Description")
    @Story("Story 加法测试")
    @DisplayName("DisplayName 加法测试")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("www.baidu.com")
    @Link(name = "Link 社区贴", type = "mylink", url = "https://ceshiren.com/t/topic/7718")
    public void addTest() {
        int result01 = Calculator.add(4, 2);
        System.out.println(result01);

        int result02 = Calculator.add(5, 2);
        System.out.println(result02);

        int result03 = Calculator.add(6, 2);
        System.out.println(result03);

        assertAll("计算结果校验： ",
                () -> assertEquals(6, result01),
                () -> assertEquals(6, result02),
                () -> assertEquals(7, result03)
        );
    }

    @Test
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
        Allure.addAttachment("WechatIMG2", "image/jpeg", this.getClass().getResourceAsStream("/WechatIMG2.jpeg"), ".jpeg");
        assertEquals(2, result);

    }

    @Test
    @Order(2)
    public void multiplyTest() {
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
        assertEquals(8, result);

    }

    @Test
    @Order(3)
    public void divideTest() {
        int result = Calculator.divide(4, 2);
        System.out.println(result);
        assertEquals(2, result);

    }

    @BeforeEach
    public void clear() {
        Calculator.clear();
    }

    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4, result);
    }
}
