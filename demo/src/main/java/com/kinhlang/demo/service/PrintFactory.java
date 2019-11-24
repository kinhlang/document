package com.kinhlang.demo.service;

public class PrintFactory {
    /**
     * 打印内容
     */
    public final static String document = "工厂打印";

    /**
     * 打印
     */
    public void print(){
        write();
    }

    protected void write(){
        System.out.println(document);
    }
}
