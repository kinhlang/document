package com.kinhlang.demo;

import com.kinhlang.demo.service.PrintFactory;
import com.kinhlang.demo.service.PrintService;
import com.kinhlang.demo.service.PrintService2;
import org.junit.jupiter.api.Test;

public class PrintTest {
    @Test
    public void p(){
        PrintService printService = new PrintService();
        printService.print();

        PrintFactory printFactory = new PrintFactory();
        printFactory.print();

        PrintService2 printService2 = new PrintService2();
        printService2.print();
    }
}
