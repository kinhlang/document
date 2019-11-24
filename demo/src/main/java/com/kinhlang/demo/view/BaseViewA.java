package com.kinhlang.demo.view;

import com.kinhlang.demo.bean.BaseClazz;

public class BaseViewA extends BaseClazz {
    /**
     * 编号
     */
    private String code;

    private String name;

    public BaseViewA(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClazz() {
        return name;
    }

    public void setClazz(String clazz) {
        this.name = clazz;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("销毁ViewA");
    }
}
