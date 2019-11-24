package com.kinhlang.demo.bean;

public class BaseClazz {
    /**
     * 名称
     */
    public String clazz;

    public static String enName = "初值";

    static {
//        enName = "静态块";
    }

    public BaseClazz(){
//        enName = "构造方法";
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("销毁BaseClazz");
    }


}
