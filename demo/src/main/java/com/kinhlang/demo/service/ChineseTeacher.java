package com.kinhlang.demo.service;

import com.kinhlang.demo.inter.Driver;
import com.kinhlang.demo.inter.Teacher;

public class ChineseTeacher implements Teacher, Driver {
    @Override
    public void teach() {
        System.out.println("教语文课");
    }

    @Override
    public void work() {
        System.out.println("语文老师的工作是教语文课");
    }

    @Override
    public void drive() {
        System.out.println("驾驶奥迪A4L");
    }
}
