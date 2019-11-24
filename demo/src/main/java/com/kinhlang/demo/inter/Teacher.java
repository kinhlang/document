package com.kinhlang.demo.inter;

public interface Teacher extends Human,People{

    String TYPE = "0";

    /**
     * 教课
     */
    void teach();

    default void eat(){
        System.out.println("老师会吃饭");
    }

    @Override
    default void work() {
        System.out.println("老师的工作是教书");
    }
}
