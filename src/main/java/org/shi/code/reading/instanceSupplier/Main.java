package org.shi.code.reading.instanceSupplier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:instanceSupplier.xml");

        Object tu = ac.getBean("tu");

        System.out.println(tu);
    }
}
