package com.junit;

import org.junit.*;

//测试类
public class TestUserService {

    //修饰实例方法
    @Before
    public void before() {
        System.out.println("before方法执行一次");
    }

    @After
    public void after() {
        System.out.println("after方法执行一次");
    }

    //修饰静态方法
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass方法执行一次");
    }

    //修饰静态方法
    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass方法执行一次");
    }

    //测试方法

    /**
     * 1.必须公开，无参数，无返回值
     * 2.必须使用@Test注解标记
     */
    @Test
    public void testLoginName() {
        UserService userService = new UserService();
        String rs = userService.loginName("admin", "123456");

        //进行预期结果正确性测试：断言
        Assert.assertEquals("功能业务数据出现问题", "登录成功", rs);
    }

    @Test
    public void testSelectNames() {
        UserService userService = new UserService();
        userService.selectNames();

    }

}
