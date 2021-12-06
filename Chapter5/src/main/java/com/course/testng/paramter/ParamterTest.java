package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"name"})
    public void paramTest1(String name){
        System.out.println("name = " + name);
    }

}
