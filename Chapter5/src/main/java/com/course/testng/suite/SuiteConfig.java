package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行开始啦！！！！！！！！！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行开始啦！！！！！！！！！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 运行开始啦！！！！！！！！！");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 运行开始啦！！！！！！！！！");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("运行开始啦  beforeClass！！！！！！！！！");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("运行开始啦  afterClass！！！！！！！！！");
    }

}
