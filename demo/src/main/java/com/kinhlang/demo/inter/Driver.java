package com.kinhlang.demo.inter;

public interface Driver extends Human,People{
    /**
     * 驾驶
     */
    void drive();

    /**
     * 吃饭
     */
    default void eat(String what){
        System.out.println("司机会吃饭");
    }

    @Override
    default void work() {
        System.out.println("司机的工作是开车");
    }
}
