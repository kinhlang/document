package com.kinhlang.demo.service;

public class PrintService extends PrintFactory {
    /**
     * 打印内容
     */
    protected String document = "现场打印";

    @Override
     public void write() {
        System.out.println(document);
    }
}
