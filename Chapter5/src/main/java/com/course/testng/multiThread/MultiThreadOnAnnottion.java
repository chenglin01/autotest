package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnottion {

    /**
     * 注解实现多线程
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
//        System.out.println("Thread ID : "+ Thread.currentThread().getId());
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }


}
