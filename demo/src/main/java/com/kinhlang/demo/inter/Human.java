package com.kinhlang.demo.inter;

public interface Human {

    default void work(){
        System.out.println("人会工作");
    }
}
