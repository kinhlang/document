package com.kinhlang.demo;

import com.kinhlang.demo.bean.BaseClazz;
import com.kinhlang.demo.view.BaseViewA;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class BaseViewTest {
    @Test
    public void A() {
        BaseViewA viewA = new BaseViewA();
        viewA.setName("ViewA");
        Field[] fields= viewA.getClass().getDeclaredFields();
        for (Field field:fields) {
            field.setAccessible(true);
            System.out.println(field.getName());
        }
//        System.exit(0);
        System.out.println(BaseClazz.enName);
        System.out.println(viewA.getName());
    }
}
