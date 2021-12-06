package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法222222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法333333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444444");
    }

    @BeforeGroups("server")
    public void serverTest(){
        System.out.println("这是服务端组，运行之前的方法");
    }

    @AfterGroups("server")
    public void serverTest2(){
        System.out.println("这是服务端组，运行之后的方法");
    }

    @BeforeGroups("client")
    public void clientTest(){
        System.out.println("这是客户端组，运行之前的方法");
    }

    @AfterGroups("client")
    public void clientTest2(){
        System.out.println("这是客户端组，运行之后的方法");
    }

}
