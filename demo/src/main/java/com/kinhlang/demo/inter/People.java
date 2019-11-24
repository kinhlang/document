package com.kinhlang.demo.inter;

public interface People {

    default void sleep(){
        System.out.println("人类会睡觉");
    }

    default void work(){
        System.out.println("人类会工作");
    }
}
