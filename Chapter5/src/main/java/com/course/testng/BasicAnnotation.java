package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是用例1");
    }

    @Test
    public void testCase4(){
        System.out.println("这是用例4");
    }

    @BeforeMethod
    public void testCase2(){
        System.out.println("这是BeforeMethod");
    }

    @AfterMethod
    public void testCase3(){
        System.out.println("这是AfterMethod");
    }

    @BeforeClass
    public void testCase5(){
        System.out.println("这是BeforeClass");
    }

    @AfterClass
    public void testCase6(){
        System.out.println("这是AfterClass");
    }

    @BeforeSuite
    public void testCase7(){
        System.out.println("这是BeforeSuite");
    }

    @AfterSuite
    public void testCase8(){
        System.out.println("这是AfterSuite");
    }

    @BeforeTest
    public void testCase9(){
        System.out.println("这是   BeforeTest");
    }

    @AfterTest
    public void testCase10(){
        System.out.println("这是  AfterTest");
    }


}
