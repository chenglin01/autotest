package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass11111 的 stu11111 执行开始！！");
    }

    public void stu2(){
        System.out.println("GroupsOnClass11111 的 stu22222 执行开始！！");
    }


}
