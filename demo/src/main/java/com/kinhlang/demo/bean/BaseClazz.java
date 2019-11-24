package com.kinhlang.demo.bean;

public class BaseClazz {
    /**
     * 名称
     */
    private String name;

    public static String enName = "初值";

    static {
//        enName = "静态块";
    }

    public BaseClazz(){
//        enName = "构造方法";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("销毁BaseClazz");
    }
}
